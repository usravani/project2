<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Watches</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <%@include file="header.jsp" %>
   <center><img src="resources/images/login.jpg" style="width: 300px"; height="300px"></center>
</head>
<body style="background-color:powderblue;">
  <div class="container-fluid">
    

<div>
 
    <div align="center" class="form">
    <h1 class="text-primary">Login</h1>
   <form name='f' action="<c:url value='j_spring_security_check'/>" method='POST' >
      <table>
         <tr>
           <td style="font-size: 20px">Enter User Name:</td> <td><input type='text' name='j_username' style="width:300px;height: 40px" placeholder="UserName Required" s required="required"/></td><td><br></br></td>
         </tr>
         <tr><td><br></br></td></tr>
         <tr>
           <td style="font-size: 20px">Enter Password:</td> <td><input type='password' name='j_password' style="width: 300px;height: 40px" placeholder="Password Required" required="required"/></td><td><br></br></td>
         </tr>
          
         <tr><td><br></br></td></tr>
         <tr><td>
         <p>New User<a href="signUp">Register Here</a>
         <tr><td>
         
            <td><input name="submit" type="submit" value="Login" /></td>
            
         </tr>
           
      </table>
  </form>

 </div>
 
</div>
</body>
<br></br>
<br></br>
<br></br>

<%@include file="footer.jsp" %>
</html>


