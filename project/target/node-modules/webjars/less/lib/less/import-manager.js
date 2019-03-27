var contexts = require("./contexts"),
    Parser = require('./parser/parser'),
    FunctionImporter = require('./plugins/function-importer');

module.exports = function(environment) {

    // FileInfo = {
    //  'relativeUrls' - option - whether to adjust URL's to be relative
    //  'filename' - full resolved filename of current file
    //  'rootpath' - path to append to normal URLs for this node
    //  'currentDirectory' - path to the current file, absolute
    //  'rootFilename' - filename of the base file
    //  'entryPath' - absolute path to the entry file
    //  'reference' - whether the file should not be output and only output parts that are referenced

    var ImportAdmin = function(context, rootFileInfo) {
        this.rootFilename = rootFileInfo.filename;
        this.paths = context.paths || [];  // Search paths, when importing
        this.contents = {};             // map - filename to contents of all the files
        this.contentsIgnoredChars = {}; // map - filename to lines at the beginning of each file to ignore
        this.mime = context.mime;
        this.error = null;
        this.context = context;
        // Deprecated? Unused outside of here, could be useful.
        this.queue = [];        // Files which haven't been imported yet
        this.files = {};        // Holds the imported parse trees.
    };
    /**
     * Add an import to be imported
     * @param path - the raw path
     * @param tryAppendLessExtension - whether to try appending the less extension (if the path has no extension)
     * @param currentFileInfo - the current file info (used for instance to work out relative paths)
     * @param importOptions - import options
     * @param callback - callback for when it is imported
     */
    ImportAdmin.prototype.push = function (path, tryAppendLessExtension, currentFileInfo, importOptions, callback) {
        var importAdmin = this;
        this.queue.push(path);

        var fileParsedFunc = function (e, root, fullPath) {
            importAdmin.queue.splice(importAdmin.queue.indexOf(path), 1); // Remove the path from the queue

            var importedEqualsRoot = fullPath === importAdmin.rootFilename;
            if (importOptions.optional && e) {
                callback(null, {rules:[]}, false, null);
            }
            else {
                importAdmin.files[fullPath] = root;
                if (e && !importAdmin.error) { importAdmin.error = e; }
                callback(e, root, importedEqualsRoot, fullPath);
            }
        };

        var newFileInfo = {
            relativeUrls: this.context.relativeUrls,
            entryPath: currentFileInfo.entryPath,
            rootpath: currentFileInfo.rootpath,
            rootFilename: currentFileInfo.rootFilename
        };

        var fileAdmin = environment.getFileAdmin(path, currentFileInfo.currentDirectory, this.context, environment);

        if (!fileAdmin) {
            fileParsedFunc({ message: "Could not find a file-Admin for " + path });
            return;
        }

        if (tryAppendLessExtension) {
            path = fileAdmin.tryAppendExtension(path, importOptions.plugin ? ".js" : ".less");
        }

        var loadFileCallback = function(loadedFile) {
            var resolvedFilename = loadedFile.filename,
                contents = loadedFile.contents.replace(/^\uFEFF/, '');

            // Pass on an updated rootpath if path of imported file is relative and file
            // is in a (sub|sup) directory
            //
            // Examples:
            // - If path of imported file is 'module/nav/nav.less' and rootpath is 'less/',
            //   then rootpath should become 'less/module/nav/'
            // - If path of imported file is '../mixins.less' and rootpath is 'less/',
            //   then rootpath should become 'less/../'
            newFileInfo.currentDirectory = fileAdmin.getPath(resolvedFilename);
            if (newFileInfo.relativeUrls) {
                newFileInfo.rootpath = fileAdmin.join(
                    (importAdmin.context.rootpath || ""),
                    fileAdmin.pathDiff(newFileInfo.currentDirectory, newFileInfo.entryPath));

                if (!fileAdmin.isPathAbsolute(newFileInfo.rootpath) && fileAdmin.alwaysMakePathsAbsolute()) {
                    newFileInfo.rootpath = fileAdmin.join(newFileInfo.entryPath, newFileInfo.rootpath);
                }
            }
            newFileInfo.filename = resolvedFilename;

            var newEnv = new contexts.Parse(importAdmin.context);

            newEnv.processImports = false;
            importAdmin.contents[resolvedFilename] = contents;

            if (currentFileInfo.reference || importOptions.reference) {
                newFileInfo.reference = true;
            }

            if (importOptions.plugin) {
                new FunctionImporter(newEnv, newFileInfo).eval(contents, function (e, root) {
                    fileParsedFunc(e, root, resolvedFilename);
                });
            } else if (importOptions.inline) {
                fileParsedFunc(null, contents, resolvedFilename);
            } else {
                new Parser(newEnv, importAdmin, newFileInfo).parse(contents, function (e, root) {
                    fileParsedFunc(e, root, resolvedFilename);
                });
            }
        };

        var promise = fileAdmin.loadFile(path, currentFileInfo.currentDirectory, this.context, environment,
            function(err, loadedFile) {
            if (err) {
                fileParsedFunc(err);
            } else {
                loadFileCallback(loadedFile);
            }
        });
        if (promise) {
            promise.then(loadFileCallback, fileParsedFunc);
        }
    };
    return ImportAdmin;
};
