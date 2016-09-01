<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watches</title>
<%@include file="header.jsp" %>
</head>
<body style="background-color:Azure ;">
  
  <h1 class="text-center" class="text-primary">CONTACT Us</h1>
  <div class="row">
    <div class="col-sm-5">
      <h6 style="color:black;">Contact us and we'll get back to you within 24 hours.</h6>
      <h6 style="color:black;"><span class="glyphicon glyphicon-map-marker"></span> Sravani Watch Store,Beside KFC ,Miyapur,Hyderabad,India</h6>
      <h6 style="color:black;"><span class="glyphicon glyphicon-phone"></span> 040 22303757</h6>
      <h6 style="color:black;"><p><span class="glyphicon glyphicon-envelope"></span> 24Hours@gmail.com</h6>
    </div>
    <div class="col-sm-8">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</body>
<br></br>
<br></br>
<center><%@include file="footer.jsp" %></center>
</html>