package edu.jspiders.beanwiringimplicitannotation.beans;

public class Refil 
{
	private String brand;
	private String type;
	private double price;
	
	public Refil() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Refil(String brand, String type, double price) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Refil [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
}
