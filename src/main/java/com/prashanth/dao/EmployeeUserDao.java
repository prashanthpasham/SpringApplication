package com.prashanth.dao;

import java.util.List;

import com.prashanth.model.Login;

public interface EmployeeUserDao 
{
boolean	LoginAuthenticate(String uname,String pwd);
List LoginEmployee(String uname,String pwd);
boolean RegisterEmployee(Login login);
//List adminDashboard(String uname,String pwd);
}
