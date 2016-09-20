<%@include file="adminHeader.jsp" %>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${ss}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>itemId</th>
    <th>itemName</th>
    <th>description</th>
    <th>category</th>
    <th>price</th>
    <th>Image</th>
     </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.itemId}}</td>
            <td>{{ resource.itemName}}</td>
            <td>{{ resource.description}}</td>
            <td>{{ resource.category}}</td>
            <td>{{ resource.price}}</td>
            <td><img src="resources/images/{{resource.itemId}}.jpg" style="width:100px;height:100px"></td>
            <td><a href="deleteItem?id={{resource.itemId}}" onclick ="return confirm('Are you sure you want to delete');">Delete</a></td>
            <td><a href="editItem?id={{resource.itemId}}">Edit</a>
            
             </tr>    
    </table>
</div>
<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofitems};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>
</html>
            
          
