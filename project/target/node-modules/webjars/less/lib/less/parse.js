var PromiseConstructor,
    contexts = require("./contexts"),
    Parser = require('./parser/parser'),
    PluginAdmin = require('./plugin-Admin');

module.exports = function(environment, ParseTree, ImportAdmin) {
    var parse = function (input, options, callback) {
        options = options || {};

        if (typeof options === 'function') {
            callback = options;
            options = {};
        }

        if (!callback) {
            if (!PromiseConstructor) {
                PromiseConstructor = typeof Promise === 'undefined' ? require('promise') : Promise;
            }
            var self = this;
            return new PromiseConstructor(function (resolve, reject) {
                parse.call(self, input, options, function(err, output) {
                    if (err) {
                        reject(err);
                    } else {
                        resolve(output);
                    }
                });
            });
        } else {
            var context,
                rootFileInfo,
                pluginAdmin = new PluginAdmin(this);

            pluginAdmin.addPlugins(options.plugins);
            options.pluginAdmin = pluginAdmin;

            context = new contexts.Parse(options);

            if (options.rootFileInfo) {
                rootFileInfo = options.rootFileInfo;
            } else {
                var filename = options.filename || "input";
                var entryPath = filename.replace(/[^\/\\]*$/, "");
                rootFileInfo = {
                    filename: filename,
                    relativeUrls: context.relativeUrls,
                    rootpath: context.rootpath || "",
                    currentDirectory: entryPath,
                    entryPath: entryPath,
                    rootFilename: filename
                };
                // add in a missing trailing slash
                if (rootFileInfo.rootpath && rootFileInfo.rootpath.slice(-1) !== "/") {
                    rootFileInfo.rootpath += "/";
                }
            }

            var imports = new ImportAdmin(context, rootFileInfo);

            new Parser(context, imports, rootFileInfo)
                .parse(input, function (e, root) {
                if (e) { return callback(e); }
                callback(null, root, imports, options);
            }, options);
        }
    };
    return parse;
};
