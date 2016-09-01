<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watches</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
 
  <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
  
</head>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse"  data-target="#navbar">
       <span class="icon-bar"></span>
	   <span class="icon-bar"></span>
	   <span class="icon-bar"></span>
       </button>
      <a class="navbar-left" href="#"><img src=<c:url value="/resources/images/log1.jpg"/> alt="Watches" width="40" height="40">
   <a class="navbar-brand" href="#">24Hours.com</a>
 </div>
<div class="collapse navbar-collapse" id="navbar">
<ul class="nav navbar-nav">
      <li><a href="home">Home</a></li>
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Brands">Fastrack <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Mens?category=Mens">Mens</a></li>
		  <li><a href="Mens?category=Womens">Womens</a></li>
	  </ul>
	  <li><a href="logout"> <span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
	  
    
	

  </ul>
 </div>

</div>
    </nav>

<body>