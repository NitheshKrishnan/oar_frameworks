package edu.jspiders.setterinjectionforcollectiontype.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjectionforcollectiontype.beans.ListTypeCollection;
import edu.jspiders.setterinjectionforcollectiontype.beans.MapType;
import edu.jspiders.setterinjectionforcollectiontype.beans.SetTypeCollection;

public class CollectionTypeUtil 
{
	public static void main(String[] args) 
	{
		// Create the Container
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		
		ListTypeCollection l = (ListTypeCollection) context.getBean("l");
		SetTypeCollection s = (SetTypeCollection) context.getBean("s");
		MapType m = (MapType) context.getBean("m");
		
		System.out.println(l);
		System.out.println(s);
		System.out.println(m);
		
		// Close the Container
		context.close();
	}
}
