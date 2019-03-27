var logger = require("../logger");
var environment = function(externalEnvironment, fileAdmins) {
    this.fileAdmins = fileAdmins || [];
    externalEnvironment = externalEnvironment || {};

    var optionalFunctions = ["encodeBase64", "mimeLookup", "charsetLookup", "getSourceMapGenerator"],
        requiredFunctions = [],
        functions = requiredFunctions.concat(optionalFunctions);

    for (var i = 0; i < functions.length; i++) {
        var propName = functions[i],
            environmentFunc = externalEnvironment[propName];
        if (environmentFunc) {
            this[propName] = environmentFunc.bind(externalEnvironment);
        } else if (i < requiredFunctions.length) {
            this.warn("missing required function in environment - " + propName);
        }
    }
};

environment.prototype.getFileAdmin = function (filename, currentDirectory, options, environment, isSync) {

    if (!filename) {
        logger.warn("getFileAdmin called with no filename.. Please report this issue. continuing.");
    }
    if (currentDirectory == null) {
        logger.warn("getFileAdmin called with null directory.. Please report this issue. continuing.");
    }

    var fileAdmins = this.fileAdmins;
    if (options.pluginAdmin) {
        fileAdmins = [].concat(fileAdmins).concat(options.pluginAdmin.getFileAdmins());
    }
    for (var i = fileAdmins.length - 1; i >= 0 ; i--) {
        var fileAdmin = fileAdmins[i];
        if (fileAdmin[isSync ? "supportsSync" : "supports"](filename, currentDirectory, options, environment)) {
            return fileAdmin;
        }
    }
    return null;
};

environment.prototype.addFileAdmin = function (fileAdmin) {
    this.fileAdmins.push(fileAdmin);
};

environment.prototype.clearFileAdmins = function () {
    this.fileAdmins = [];
};

module.exports = environment;
