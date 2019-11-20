package edu.jspiders.beanwiringexplicitxml.beans;

public class Student 
{
	private int id;
	private String name;
	private String gender;
	private String marks;
	private Address addr;
	
	public Student() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Student(int id, String name, String gender, String marks, Address addr)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
		this.addr = addr;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", marks=" + marks + ", addr=" + addr
				+ "]";
	}
}