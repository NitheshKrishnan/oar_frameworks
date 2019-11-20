package edu.jspiders.beanwiringexplicitxml.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringexplicitxml.beans.Student;

public class BeanWiringExplicitXmlUtil 
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		Student s = context.getBean(Student.class);
		
		System.out.println(s);
		
		// Close the Container
		context.close();
	}
}
