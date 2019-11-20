package edu.jspiders.setterinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjection.beans.Pen;

public class SetterUtil 
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		Pen pen = (Pen) context.getBean("p1");
		
		System.out.println(pen);
		
		// Close the Container
		context.close();
	}
}