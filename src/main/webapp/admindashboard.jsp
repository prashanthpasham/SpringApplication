<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBoard</title>
<style>
        body
        {
        background-image:url('images/fdimage2.jpg');
        background-size:cover;
        }
       
 </style>
</head>
<body>
<div class="row">
<div class="col-md-12">
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     <!-- <a class="navbar-brand" href="#">DashBoard</a>-->
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     <!--  <ul class="nav navbar-nav">
         <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        
        </ul>-->
      <div class="navbar-form navbar-left">
       
       <h1>Welcome:${sessionScope.name}</h1>
      
      </div>
      <ul class="nav navbar-nav navbar-right">
        <li><a  href="logout.do" class="btn btn-danger"><span class="red" style="color:white">Logout</span></a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>
</div>
</body>
</html>