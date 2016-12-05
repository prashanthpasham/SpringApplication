package com.prashanth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.prashanth.model.Login;

public class EmployeeUserDaoImpl implements EmployeeUserDao 
{
   @Autowired
   private HibernateTemplate ht;
   public void setHt(HibernateTemplate ht)
   {
	   this.ht = ht;
   }
   public boolean LoginAuthenticate(String uname,String pwd) 
	{
	   
	 ht.find("from Login l where l.userName=? and password=?",uname,pwd);

	
		return true;
	}
	public List LoginEmployee(String uname,String pwd) 
	{
		
	List list = ht.find("from Login l where l.userName=? and password=?",uname,pwd);
		return list;
	}
	public boolean RegisterEmployee(Login login) 
	{
		try
		{
		ht.save(login);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	/*public List adminDashboard(String uname, String pwd) 
	{
     List list = ht.find("from Login l where l.userName=? and password=?",uname,pwd);
	return list;	
	}*/

}
