package edu.jspiders.firstspringapp.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.firstspringapp.beans.ClassA;

public class SpringUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		ClassA classA = (ClassA)context.getBean("a");

		classA.m1();
		
		// Close the Container
		context.close();
	}
}
