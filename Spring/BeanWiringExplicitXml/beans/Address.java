package edu.jspiders.beanwiringexplicitxml.beans;

public class Address 
{
	private int houseNumber;
	private String apartmentName;
	private String street;
	private String locality;
	private long pincode;
	
	public Address() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Address(int houseNumber, String apartmentName, String street, String locality, long pincode) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.houseNumber = houseNumber;
		this.apartmentName = apartmentName;
		this.street = street;
		this.locality = locality;
		this.pincode = pincode;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", apartmentName=" + apartmentName + ", street=" + street
				+ ", locality=" + locality + ", pincode=" + pincode + "]";
	}
}
