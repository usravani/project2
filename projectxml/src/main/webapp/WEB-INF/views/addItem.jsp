<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watches</title>
<%@include file="adminHeader.jsp" %>
<center><img src="resources/images/AddProduct.png" style="width: 300px"; height="300px"></center>
</head>
<body style="background-color:powderblue;">
<center>
<table>
<h1 class="text-primary">Enter Product Details</h1>
<form:form action="addProduct" commandName="item"  enctype="multipart/form-data">
<tr>
<td>Item Name:</td>
<td><form:input path="itemName"></form:input><form:errors path="itemName" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td> Item Price:</td>
<td><form:input path="price"></form:input><form:errors path="price" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td> Item Description:</td>
<td><form:input path="description"></form:input><form:errors path="description" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td>Category:</td>
<td>
<form:select path="Category">
<form:option value="Mens"></form:option>
<form:option value="Womens"></form:option>
</form:select></td></tr>
<tr><td><br></td></tr>
<tr>
<td> Item image<input type="file" value="choosefile" name="choosefile"></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td><td><input type="submit" value="AddProducts"/></td></td>
</tr>
</form:form>
</table>
</center>
</body>
<br></br>
<br></br>
<br></br>
<%@include file="footer.jsp" %>
</html>