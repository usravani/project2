<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>

</head>
<body>
<% 
session.invalidate();
%>
<center><img src="resources/images/thank_you.jpg" style="width: 300px"; height="300px"></center>
</body>
 <br></br>
 <br></br>
 <br></br>
<center> <%@include file="footer.jsp" %></center>
</html>