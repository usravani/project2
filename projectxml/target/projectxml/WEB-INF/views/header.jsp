<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link href="<c:url  value="/resouces/css/footer.css"/>" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
      
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
     
    }
    .btn-lg {
        width: 100%;
        margin-bottom: 35px;
    }
  }
  @media screen and (max-width: 480px) {
    .logo {
        font-size: 150px;
    }
  
   }
  </style>
</head>

<body>
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
       <li><a href="About us">About us</a></li>
	  <li><a href="Contact Us">Contact Us</a></li>
	  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Brands">Fastrack <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Mens?category=Mens">Mens</a></li>
		  <li><a href="Mens?category=Womens">Womens</a></li>
        
		</ul>
	  </ul>
	  
    <ul class="nav navbar-nav navbar-right">
      <li><a href="signUp"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>
      <li><a href="CustomerCheck"><span class="glyphicon glyphicon-user"></span>Login</a></li>
    </ul>
	
 </div>

</div>
    </nav>

</body>
</html>