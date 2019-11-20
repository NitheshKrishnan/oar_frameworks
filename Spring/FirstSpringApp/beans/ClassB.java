package edu.jspiders.firstspringapp.beans;

public class ClassB
{
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	public void m2()
	{
		System.out.println("Inside m2() of ClassB");
	}
}