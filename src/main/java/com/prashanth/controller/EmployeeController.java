package com.prashanth.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prashanth.dao.EmployeeDao;
import com.prashanth.model.Employee;
@Controller
public class EmployeeController 
{
	
	private EmployeeDao dao;
	@Autowired
	public void setDao(EmployeeDao dao)
	{
		this.dao = dao;
	}
@RequestMapping(value="/addemployeepage")
public ModelAndView getAddEmployeePage()
{
	return new ModelAndView("addemployeepage","message","");

}
@RequestMapping(value="/employees",method=RequestMethod.GET)
public ModelAndView selectEmployees()
{
	List list = dao.selectEmployees();
	ModelAndView mav = new ModelAndView("listemployees");
	mav.addObject("emp",list);
	return mav;
	//return new ModelAndView("listemployees","emp",list);
	
}
@RequestMapping(value="/editEmployee",method=RequestMethod.GET)

public ModelAndView ModelAndView(@RequestParam("empId") String eid)
{
	Employee e=null;
	int empid = Integer.parseInt(eid);
	List list = dao.editEmployee(empid);
	//partial entity iteration
	Iterator it = list.iterator();
	while(it.hasNext())
	{
		e =(Employee)it.next();
	}
	ModelAndView mav = new ModelAndView("editemployee");
	mav.addObject("employeelist",e);
	return mav;
}
@RequestMapping(value="/addemployee")
public ModelAndView addEmployee(HttpServletRequest req)
{
	String id = req.getParameter("empid");
	int eid = Integer.parseInt(id);
	String ename = req.getParameter("empname");
	String sal = req.getParameter("empsal");
	int salary = Integer.parseInt(sal);
	String contact = req.getParameter("phone");
	long phone = Long.parseLong(contact);
	Employee e = new Employee();
	e.setEmpId(eid);
	e.setEmpName(ename);
	e.setSalary(salary);
	e.setPhone(phone);
	boolean flag = dao.addEmployee(e);
	ModelAndView mav=null;
	if(flag==true)
	mav = new ModelAndView("addemployee","message","employee details added!");
return mav;
}
@RequestMapping(value="/editemployee")
public ModelAndView editEmployee(HttpServletRequest req)
{
	String id = req.getParameter("empid");
	int eid = Integer.parseInt(id);
	String ename = req.getParameter("empname");
	String sal = req.getParameter("empsal");
	int salary = Integer.parseInt(sal);
	String contact = req.getParameter("phone");
	long phone = Long.parseLong(contact);
	Employee e = new Employee();
	e.setEmpId(eid);
	e.setEmpName(ename);
	e.setSalary(salary);
	e.setPhone(phone);
	boolean flag = dao.addEmployee(e);
	ModelAndView mav=null;
	 List list = null;
	if(flag==true)
	{
	   list = dao.selectEmployees();
	 mav = new ModelAndView("listemployees");
	mav.addObject("emp",list);
	}
	return mav;	
   
}
@RequestMapping(value="/deleteEmployee")
public ModelAndView deleteEmployee(@RequestParam("empId") String eid)
{
int empid = Integer.parseInt(eid);
dao.deleteEmployee(empid);
List list = dao.selectEmployees();
ModelAndView mav = new ModelAndView("listemployees");
mav.addObject("emp",list);
return mav;
}
}
