package edu.jspiders.beanwiringimplicitannotationwaywithcomponentscan.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringimplicitannotationwaywithcomponentscan.beans.Pen;

public class Util 
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		// Use the Bean
		Pen pen = context.getBean(Pen.class);
		
		System.out.println(pen);
		
		// Close the Container
		context.close();
	}
}
