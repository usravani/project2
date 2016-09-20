
<%@include file="Itemsheader.jsp" %>

<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  
  Data:${ss}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>cartItemId</th>
    <th>quantity</th>
    <th>totalPrice</th>
     </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.cartItemId}}</td>
            <td>{{ resource.totalPrice}}</td>
            <td>{{ resource.quantity}}</td>
             <td><img src="resources/images/{{resource.imageid}}.jpg" style="width:100px;height:100px"></td>
             <td><a href="deleteItem?id={{resource.cartItemId}}" onclick="return confirm('confirm to delete');">Delete</a></td>
            </tr>    
    </table>
</div>
</div>
<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${mycartlist};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>
</html>
            
          

