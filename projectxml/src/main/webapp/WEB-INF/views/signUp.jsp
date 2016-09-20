<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="header.jsp" %>
<center><img src="resources/images/reg3.jpg" style="width: 300px"; height="300px"></center>
</head>
<body>
<h4>${message }</h4>
<div class="form-container">
     <center>
    
<form:form commandName="customer" >
<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="uname"></label>
                <div class="col-md-7">
UserName:<form:input path="username"></form:input><form:errors path="username" style="color:red"></form:errors>
</div>
                </div>
            </div>
            <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="password"></label>
                <div class="col-md-7">
Password:<form:password path="password"></form:password><form:errors path="password" style="color:red"></form:errors>
</div>
                </div>
            </div>
     <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-5 control-lable" for="emailid"></label>
                <div class="col-md-7">       
EmailId:<form:input path="emailId"></form:input><form:errors path="emailId" style="color:red"></form:errors>
</div>
                </div>
            </div> 
          
<input name ="_eventId_submit" type="submit" value="register"/>
</form:form>
</center>
</div>
<br></br>
<br></br>
<%@include file="footer.jsp" %>
</body>
</html>