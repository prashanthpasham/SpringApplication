package com.prashanth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginemp")
public class Login 
{
@Id
@Column(name="username",length=30)
private String userName;
@Column(name="password",length=10)
private String password;
@Column(name="role",length=8)
private String role;
@Column(name="status",length=8)
private String status;
public String getRole() 
{
	return role;
}
public void setRole(String role) 
{
	this.role = role;
}
public Login(){}
public Login(String userName, String password,String role,String status)
{
	this.userName = userName;
	this.password = password;
	this.role = role;
	this.status = status;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
