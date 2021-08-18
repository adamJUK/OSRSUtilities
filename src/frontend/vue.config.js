module.exports = {
    outputDir: "../main/resources/public",
    devServer: {
        port: 5432,
        proxy: {
            "/api": {
                target: "http://localhost:9000",
                changeOrigin: true,
                secure: false,
            },
        },
    },
    runtimeCompiler: true,
};