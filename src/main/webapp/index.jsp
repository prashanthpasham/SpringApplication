<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
        
        <style>
        body
        {
        background-image:url('images/fdimage2.jpg');
        background-size:cover;
        }
        a
        {
        color:white;
        }
        </style>
    </head>
    <body>
    
    <script src="bootstrap/js/bootstrap.min.js"></script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    
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
     <a class="navbar-brand" href="#">Spring MVC</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     
      <div class="navbar-form navbar-left">
       
       
      
      </div>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="registerpage.do" class="btn btn-primary" style="margin-right:40px;color:white">Register!</a></li>
      <li><a href="loginpage.do" class="btn btn-primary" style="margin-right:40px;color:white">Login!</a></li>&nbsp; &nbsp; &nbsp;
      <li><button type="button" id="page" style="margin-right:40px;margin-top:2px" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Admin</button></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>
</div>
    
    
    <h1>
    <center>
    <div class="col-md-12" style="margin-top:15%">
    <span class="red" style="font-weight:300px;background-color:red;color:white;font-size:90px">
    SPRING MVC APPLICATION<br>
    <h1 style="align:right;background-color:red">
    This application has User Authentication and Authorization system that allows admin authorized control on user login and also it has dashboard implementation with tiles concept!
    <br>
    Technologies:Spring,Jsp,Servlet,Bootstrap,CSS<br>
    Designed and developed by:
    <a href="https://github.com/prashanthpasham" style="color:black">prashanth pasham!</a></h1>
    </span>
  
   </div><br>
   <br>
  
     </center>
     </h1>
    
     
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
       <h2 class="modal-title"><center>ADMIN LOGIN</center></h2>
         
      </div>
      <div class="modal-body">
    <div class="panel panel-primary">
<div class="panel-body">
<form action="login.do" method="post">
<input type="text" name="uname" class="form-control" placeholder="UserName" required/><br>
<input type="password" name="pwd" class="form-control" placeholder="Password" required/><br>
<input type="hidden" name="role" role="admin"/>

</div>
</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
     <input type="submit" class="btn btn-primary" value="Login"/><br>
      </form>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
</html>
