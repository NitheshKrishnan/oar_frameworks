package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.EmployeeDAO;

public class HibernateHQLReadUtil 
{
	public static void main(String[] args) 
	{
		EmployeeDAO dao = new EmployeeDAO();
		
		//dao.ReadAll();
		
		dao.DeleteBySalary();
	}
}
