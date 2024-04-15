package com.tnsif.dayfive.singleinheritance;

public class Citizen {

	
	
	//data members
	private String name;
	private int id;
	private String address;
	private String birthPlace;
	
	
	//default const
	public Citizen() {
		System.out.println("Citizen object created ");
	}
	
	//para const
	public Citizen(String name, int id, String address, String birthPlace) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.birthPlace = birthPlace;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	//object to string to return the data availble in this class 
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", id=" + id + ", address=" + address + ", birthPlace=" + birthPlace + "]";
	}
	
	
}
