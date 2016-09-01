
<%@include file="Itemsheader.jsp" %>

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
            </tr>    
    </table>
</div>
</div>
<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${me};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>
</html>
            
          

