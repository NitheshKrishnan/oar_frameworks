package edu.jspiders.beanwiringimplicitannotation.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringimplicitannotation.beans.Pen;

public class BeanWiringImplicitAnnotationUtil 
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
