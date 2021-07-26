import { isPropertyAccessOrQualifiedName } from "typescript";

var myApp =angular.module("myList",[]);
myApp.controller("myListController", function($scope){
$scope.items=["AngularJS","ReactJS","underscoreJS"];
$scope.newItem="";
$scope.pushItem= function() {
    if($scope.newItem != ""){

    
  $scope.items.push(newItem);
  $scope.newItem="";

}
}
$scope.deleteitem=function(index){
    $scope.items.splice(index, 1);
}
});

