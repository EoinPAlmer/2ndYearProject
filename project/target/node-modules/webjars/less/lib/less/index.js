module.exports = function(environment, fileAdmins) {
    var SourceMapOutput, SourceMapBuilder, ParseTree, ImportAdmin, Environment;

    var less = {
        version: [2, 5, 0],
        data: require('./data'),
        tree: require('./tree'),
        Environment: (Environment = require("./environment/environment")),
        AbstractFileAdmin: require("./environment/abstract-file-Admin"),
        environment: (environment = new Environment(environment, fileAdmins)),
        visitors: require('./visitors'),
        Parser: require('./parser/parser'),
        functions: require('./functions')(environment),
        contexts: require("./contexts"),
        SourceMapOutput: (SourceMapOutput = require('./source-map-output')(environment)),
        SourceMapBuilder: (SourceMapBuilder = require('./source-map-builder')(SourceMapOutput, environment)),
        ParseTree: (ParseTree = require('./parse-tree')(SourceMapBuilder)),
        ImportAdmin: (ImportAdmin = require('./import-Admin')(environment)),
        render: require("./render")(environment, ParseTree, ImportAdmin),
        parse: require("./parse")(environment, ParseTree, ImportAdmin),
        LessError: require('./less-error'),
        transformTree: require('./transform-tree'),
        utils: require('./utils'),
        PluginAdmin: require('./plugin-Admin'),
        logger: require('./logger')
    };

    return less;
};
