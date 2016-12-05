package com.prashanth.dao;

import java.util.List;

import com.prashanth.model.Employee;

public interface EmployeeDao 
{
boolean addEmployee(Employee e);
List selectEmployees();
List editEmployee(int empid);
void deleteEmployee(int empid);
}
