package edu.jspiders.beanwiringimplicitannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Pen 
{
	private String brand;
	private double price;
	//@Autowired
	private Refil refil;
	
	public Pen() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	public Pen(String brand, double price, Refil refil) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.brand = brand;
		this.price = price;
		this.refil = refil;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Refil getRefil() {
		return refil;
	}
	//@Autowired
	public void setRefil(Refil refil) {
		this.refil = refil;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + ", refil=" + refil + "]";
	}
}