
<div class="row" style="margin-top:7%">
<div class="col-md-12">
<div class="col-md-4"></div>
<div class="col-md-4">
<div class="panel panel-primary">
<div class="panel panel-heading">
<h1><center>Update Employee Details</center></h1>
</div>
<div class="panel-body">

<c:if test="${not empty employeelist}">


<form action="editemployee.do" method="post">
<input type="text" name="empid" class="form-control" value='${employeelist.empId}'  readonly/><br>
<input type="text" name="empname" class="form-control" value="${employeelist.empName}" /><br>
<input type="text" name="empsal" class="form-control" value="${employeelist.salary}" /><br>
<input type="text" name="phone" class="form-control" value="${employeelist.phone}"/><br>
<input type="submit" class="btn btn-primary" value="UPDATE"/><br>
</form>

</c:if>
</div>
</div>
</div>
<div class="col-md-4"></div>
</div>
</div>
