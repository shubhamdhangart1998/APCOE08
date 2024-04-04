package com.tnsif.daythree.constructordemo;

public class Customer {

	
	private String customerName;
	private int customerId;
	private String customerCity;
	
	//default constructor
	public Customer() {

	
		System.out.println("Default constructor ");
	}

	
	//parametrized constructor 
	public Customer(String customerName, int customerId, String customerCity) {

		this();  ////calling the default constructor 
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	//Getter and setter 

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}


	
	//to String 
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	
	
	
	
}
