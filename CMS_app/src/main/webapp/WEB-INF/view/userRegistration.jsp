<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DAMS-Home Page</title>

<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_navbar" value="/static/css/sticky-footer-navbar.css" />
<%-- <s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" /> --%>

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_navbar}" type="text/css" rel="stylesheet">

<%-- <link href="${url_font_awesome}" type="text/css" rel="stylesheet"> --%>
</head>
<body>
	<div class="container">
	<%@include file="common/header.jsp" %>
<!-- Main -->
 
<form action="./processUserRegistration.htm" method="post">


  <div class="form-row">

  <div class="form-group col-md-6">
    <label for="inputAddress2">First Name</label>
    <input type="text" class="form-control" name="firstname" placeholder="First name">
  </div>
  
  <div class="form-group col-md-6">
    <label for="inputAddress2">Last Name</label>
    <input type="text" class="form-control" name="lastname" placeholder="Last name">
  </div>

    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" name="email" placeholder="abc@gmail.com">
    </div>
    <div class="form-group col-md-6">
    <label for="inputAddress2">Contact</label>
    <input type="text" class="form-control" name="contact" placeholder="9977050123">
  </div>
    <div class="form-group col-md-6">
    <label for="inputAddress2">Login Name</label>
    <input type="text" class="form-control" name="loginname" placeholder="login name">
  </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" name="password" placeholder="Password">
    </div>
    
  </div>
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" name="address" placeholder="1234 Main St">
  </div>
  
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="city">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control">
        <option selected>M.P.</option>
        <option>Maharastra</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="zipCode">Zip</label>
      <input type="text" class="form-control" id="zipCode">
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="rememberMe">
      <label class="form-check-label" for="gridCheck">
        Remember me
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Register</button>
</form>
 
 
 
 
    <!-- footer -->
   <%@include file="common/footer.jsp" %>

    
	
		
	</div>
</body>
</html>