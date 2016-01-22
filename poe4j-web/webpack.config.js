var HtmlWebpackPlugin = require('html-webpack-plugin');
var path = require('path');

module.exports = {
    entry: './app/app.js',
    output: {
        path: __dirname + '/dist',
        filename: 'bundle.[hash].js'
    },
    module: {
        loaders: [
            { test: /\.css$/, loader: "style!css" },
            { test: /\.(png|woff|woff2|eot|ttf|svg)$/, loader: 'url-loader?limit=100000' },
            {
                test: /\.html$/,
                loader: 'ngtemplate!html',
                exclude: /index.html/
            }
        ]
    },
    plugins: [new HtmlWebpackPlugin({
        template: './app/index.html',
        filename: 'index.html',
        inject: 'head'
    })],
    devServer: {
        contentBase: "./dist"
    }
};