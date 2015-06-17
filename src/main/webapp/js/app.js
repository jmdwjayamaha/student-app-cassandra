/**
 * Created by Danushka Wirajith on 11/04/15.
 */

angular.module('studentApp',['ui.router','ui.bootstrap','ngResource','studentApp.controllers','studentApp.services']);

angular.module('studentApp').config(function($stateProvider,$httpProvider){
    $stateProvider.state('students',{
        url:'/students',
        templateUrl:'studentApp/partials/students.html',
        controller:'StudentListController'
    }).state('viewStudent',{
       url:'/students/:id/view',
       templateUrl:'studentApp/partials/student-view.html',
       controller:'StudentViewController'
    }).state('newStudent',{
        url:'/students/new',
        templateUrl:'studentApp/partials/student-add.html',
        controller:'StudentCreateController'
    }).state('editStudent',{
        url:'/students/:id/edit',
        templateUrl:'studentApp/partials/student-edit.html',
        controller:'StudentEditController'
    });
}).run(function($state){
   $state.go('students');
});