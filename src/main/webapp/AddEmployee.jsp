<br>
<br>
<br>
<h1>
<center>
<c:if test="${message ne null}">
<div class="col-md-12">
<div class="col-md-3"></div>
<div class="col-md-6">
<div class="alert alert-success" role="alert">
${message}
</div>
</div>
<div class="col-md-3"></div>
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
<h1><center>Add Employee</center></h1>
</div>
<div class="panel-body">
<form action="addemployee.do" method="post">
<input type="text" name="empid" class="form-control" placeholder="employeeId" required/><br>
<input type="text" name="empname" class="form-control" placeholder="employeeName" required/><br>
<input type="text" name="empsal" class="form-control"  placeholder="Salary" required/><br>
<input type="text" name="phone" class="form-control" placeholder="phone no" required/><br>
<input type="submit" class="btn btn-primary" value="Add"/><br>
</form>
</div>
</div>
</div>
<div class="col-md-4"></div>
</div>
</div>
