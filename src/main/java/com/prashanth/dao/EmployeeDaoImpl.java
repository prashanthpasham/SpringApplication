package com.prashanth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prashanth.model.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao 
{
	private HibernateTemplate ht;
	@Autowired
	public void setHt(HibernateTemplate ht)
	{
		this.ht = ht;
	}
	public boolean addEmployee(Employee e) 
	{
		ht.saveOrUpdate(e);
		return true;

	}
	public List selectEmployees() 
	{
	   List list = ht.find("from Employee e");	
		return list;
	}
	
	public List editEmployee(int empid) 
	{
		System.out.println(empid);
		List list=ht.find("from Employee e where e.empId="+empid);
		return list;
	
		
	}
	public void deleteEmployee(int empid) 
	{
		Employee e = new Employee();
		e.setEmpId(empid);
		ht.delete(e);
		
	}

}
