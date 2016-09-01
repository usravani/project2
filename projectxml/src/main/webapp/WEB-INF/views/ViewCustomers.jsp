<!DOCTYPE html>
<html lang="en">
<head>

<%@include file="adminHeader.jsp" %>
 </head>
<div>
<div>
<center><img src="resources/images/customerlogin.jpg" style="width:300px;height: 300px"></center>
</div>
<center>
<h1 class="text-primary">Customer Details</h1>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${ss}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>customerId</th>
    <th>username</th>
    <th>emailId</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.customerId}}</td>
            <td>{{resource.username}}</td>
            <td>{{resource.emailId}}</td>
        </tr>    
    </table>
</div>
<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofCustomers};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>
</html>
