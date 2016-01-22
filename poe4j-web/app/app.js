'use strict';

// Angular
var angular = require('angular');
require('angular-ui-router');
require('angular-animate');

// CSS
require('./app.css');
require('bootstrap/dist/css/bootstrap.css');

// Create the angular app
angular.module('application', ['ui.router', 'ngAnimate'])
    .config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/');
    });

// Require components
require('./home');
require('./chromatic-calculator');