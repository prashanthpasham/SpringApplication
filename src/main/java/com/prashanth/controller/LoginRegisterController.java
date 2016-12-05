package com.prashanth.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prashanth.dao.EmployeeUserDao;
import com.prashanth.model.Login;

@Controller
public class LoginRegisterController 
{
	@Autowired
	private EmployeeUserDao udao;
	public void setUdao(EmployeeUserDao udao)
	{
		this.udao = udao;
	}
	
	@RequestMapping(value="/registerpage")
	public String getRegisterPage()
	{
		return "register";
	}
@RequestMapping(value="/loginpage")
public String getLoginPage()
{
	return "login";
}
@RequestMapping(value="/register",method=RequestMethod.POST)
public ModelAndView RegisterEmployee(@RequestParam("uname") String  uname,@RequestParam("pwd") String pwd,@RequestParam("role") String role,@RequestParam("status") String status)
{
	Login login = new Login();
	login.setUserName(uname);
	login.setPassword(pwd);
	login.setRole(role);
	login.setStatus(status);
	ModelAndView mav=null;
	boolean flag = udao.RegisterEmployee(login);
	if(flag==true)
	mav = new ModelAndView("login","message","Registration sucessfully,please login!");
	return mav;
	
}
@RequestMapping(value="/login",method=RequestMethod.POST)
public ModelAndView LoginEmployee(HttpServletRequest req,@RequestParam("uname") String  uname,@RequestParam("pwd") String pwd)
{
	Login login = null;
	ModelAndView mav=null;
	
	List list = udao.LoginEmployee(uname,pwd);
	
	Iterator it = list.iterator();
	while(it.hasNext())
	{
		login =(Login)it.next();
	}
	
	try
	{
	if((login.getUserName()).equals(uname)&&((login.getPassword()).equals(login.getPassword()))&&(login.getStatus().equals("approved"))&&(login.getRole().equals("user")))
	{
		HttpSession session = req.getSession(true);
		session.setAttribute("name", uname);
		mav = new ModelAndView("welcome","data",login);
	}
	else
	{
	if((login.getUserName()).equals(uname)&&((login.getPassword()).equals(login.getPassword()))&&(login.getStatus().equals("approval"))&&(login.getRole().equals("user")))
	{
	   mav = new ModelAndView("login","message","your login is under approval!");	
	}
   else{
	   if((login.getUserName()).equals(uname)&&((login.getPassword()).equals(login.getPassword()))&&(login.getStatus().equals("approved"))&&(login.getRole().equals("admin")))
		{
		 HttpSession session = req.getSession(true); 
		 session.setAttribute("name", uname);
		   mav = new ModelAndView("admindashboard");	
		}   
	   
   }
	}
	}
	catch(Exception e)
	{
		mav = new ModelAndView("login","message","Wrong username or password!");	
	}

	
	return mav;
}
@RequestMapping(value="/logout")
public String Logout()
{
	return "logout";
}
}
