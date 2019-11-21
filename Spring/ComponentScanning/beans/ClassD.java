package edu.jspiders.componentscanning.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassD 
{
	public ClassD()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
