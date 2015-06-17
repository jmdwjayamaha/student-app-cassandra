/**
 * Created by Danushka Wirajith on 11/04/15.
 */
angular.module('studentApp.controllers',[]).controller('StudentListController',function($scope,$state,popupService,$window,Student){

    $scope.students=Student.query();

    $scope.deleteStudent=function(student){
        if(popupService.showPopup('Are you sure you need to delete the student ?')){
        	student.$delete(function(){
                $window.location.href='/studentApp';
            });
        }
    }

}).controller('StudentViewController',function($scope,$stateParams,Student){

    $scope.student=Student.get({id:$stateParams.id});

}).controller('StudentCreateController',function($scope,$state,$stateParams,Student){

    $scope.student=new Student();

    $scope.addStudent=function(){
        $scope.student.$save(function(){
            $state.go('students');
        });
    }

}).controller('StudentEditController',function($scope,$state,$stateParams,Student){

    $scope.updateStudent=function(){
        $scope.student.$update(function(){
            $state.go('students');
        });
    };

    $scope.loadStudent=function(){
        $scope.student=Student.get({id:$stateParams.id});
    };

    $scope.loadStudent();

}).controller('DatePickerController', function ($scope) {

  $scope.open = function($event) {
    $event.preventDefault();
    $event.stopPropagation();

    $scope.opened = true;
  };

});