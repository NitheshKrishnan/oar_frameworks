package edu.jspiders.constructorinjection.beans;

public class Student 
{
	private int id;
	private String name;
	private double marks;
	
	public Student() 
	{
		
	}

	public Student(int id, String name, double marks) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor(id,name,marks)");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(String name, double marks,int id) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor(name,marks,id)");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(double marks,int id, String name) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor(marks,id,name)");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}