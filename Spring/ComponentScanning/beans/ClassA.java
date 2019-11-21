package edu.jspiders.componentscanning.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassA 
{
	public ClassA()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
