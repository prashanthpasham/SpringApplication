<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix='c'%>

<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
 <style>
        body
        {
        background-image:url('images/fdimage2.jpg');
        background-size:cover;
        }
        </style>
</head>
<body>

<h1>
<center>
<c:if test="${message ne null}">
<div class="col-md-12">
<div class="col-md-4"></div>
<div class="col-md-4">
<div class="alert alert-success" role="alert">
${message}
</div>
</div>
<div class="col-md-4"></div>
</div>
</c:if>
</center>
</h1>

<div class="row">
<div class="col-md-12">
<div class="col-md-4"></div>
<div class="col-md-4">
<div class="panel panel-primary">
<div class="panel panel-heading">
<h1><center>Registration</center></h1>
</div>
<div class="panel-body">
<form action="register.do" method="post">
<input type="text" name="uname" class="form-control" placeholder="UserName" required/><br>
<input type="password" name="pwd" class="form-control" placeholder="Password" required/><br>
<input type="hidden" name="role" class="form-control" value="user"/><br>
<input type="hidden" name="status" class="form-control" value="approval"/>
<input type="submit" class="btn btn-primary" value="Register"/><br>
</form>
</div>
</div>
</div>
<div class="col-md-4"></div>
</div>
</div>
</body>
</html>