package edu.jspiders.beanwiringimplicitannotationwaywithcomponentscan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen 
{
	@Value("Cello")
	private String brand;
	@Value("10.0")
	private double price;
	@Autowired
	private Refil refil;
	
	public Pen() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Pen(String brand, double price, Refil refil) 
	{
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

	public void setRefil(Refil refil) {
		this.refil = refil;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + ", refil=" + refil + "]";
	}
}