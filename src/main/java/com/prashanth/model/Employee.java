package com.prashanth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EmpTable")
public class Employee 
{
@Id

private Integer empId;

@Column(name="ename",length=30)

private String empName;

@Column(name="salary")
private Integer salary;

@Column(name="phone")
private Long phone;
public String toString()
{
	return empId+","+empName+","+salary+","+phone;
	
}
 
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}

}
