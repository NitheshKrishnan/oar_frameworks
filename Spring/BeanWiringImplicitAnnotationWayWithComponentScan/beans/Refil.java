package edu.jspiders.beanwiringimplicitannotationwaywithcomponentscan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Refil 
{
	@Value("Reynolds")
	private String brand;
	@Value("Ball Point")
	private String type;
	@Value("2.0")
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
