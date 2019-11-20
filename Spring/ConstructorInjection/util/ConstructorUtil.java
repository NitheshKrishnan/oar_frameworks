package edu.jspiders.constructorinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.constructorinjection.beans.Car;
import edu.jspiders.constructorinjection.beans.Student;

public class ConstructorUtil 
{
	public static void main(String[] args) 
	{
		// Create the COntainer
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// use the Bean
		//Car c = context.getBean(Car.class);
		
		Student s1 = (Student) context.getBean("s1");
		Student s2 = (Student) context.getBean("s2");
		Student s3 = (Student) context.getBean("s3");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Close the Container
		context.close();
	}
}
