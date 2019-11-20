package edu.jspiders.constructorinjection.beans;

public class Car 
{
	private String vehicleNumber;
	private String brand;
	private String name;
	private double price;
	
	public Car()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Car(String vehicleNumber, String brand, String name, double price) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [vehicleNumber=" + vehicleNumber + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
}