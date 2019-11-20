package edu.jspiders.hibernatehql.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.hibernatehql.dto.Employee;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class EmployeeDAO 
{
	public void ReadAll()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM Employee";
		
		Query query = session.createQuery(hql);
		
		List<Employee> employees = query.list();
		
		for(Employee employee : employees)
		{
			System.out.println(employee);
		}
		
		session.close();
	}
	
	public void DeleteBySalary()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "DELETE FROM Employee where salary > 20000";
		
		Query query = session.createQuery(hql);
		
		int count = query.executeUpdate();
		
		System.out.println("Query OK, "+count+" no. of rows Affected");
		
		session.close();
	}
	
	public void ReadBySalary(double salary)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM Employee where salary > ?";
		
		Query query = session.createQuery(hql);
	
		query.setDouble(1, salary);
		
		List<Employee> employees = query.list();
		
		for(Employee employee : employees)
		{
			System.out.println(employee);
		}
		session.close();
	}
}