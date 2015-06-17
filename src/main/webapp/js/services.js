/**
 * Created by Danushka Wirajith on 11/04/15.
 */

angular.module('studentApp.services',[]).factory('Student',function($resource){
    return $resource('/studentApp/api/students/:id',{id:'@id'},{
        update: {
            method: 'PUT'
        }
    });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});