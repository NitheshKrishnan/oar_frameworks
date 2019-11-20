package edu.jspiders.singletonfactory.classes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonFactory 
{
	private static SessionFactory factory;
	
	private SingletonFactory()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	static
	{
		System.out.println("executing static block of SingletonFactory");
		
		factory = new Configuration()
				.configure()
				.buildSessionFactory();
	}
	
	public static SessionFactory getFactory()
	{
		return factory;
	}
}