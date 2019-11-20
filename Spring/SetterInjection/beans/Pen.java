package edu.jspiders.setterinjection.beans;

public class Pen 
{
	private int serialNumber;
	private String brand;
	private double price;
	
	public Pen() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) 
	{
		System.out.println("calling setSerialNumber()");
		
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) 
	{
		System.out.println("calling setBrand()");
		
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)
	{
		System.out.println("calling setPrice()");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [serialNumber=" + serialNumber + ", brand=" + brand + ", price=" + price + "]";
	}
}