package edu.jspiders.componentscanning.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanUtil 
{
	public static void main(String[] args)
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		// Use the Bean
		
		// Close the Container
		context.close();
	}
}
