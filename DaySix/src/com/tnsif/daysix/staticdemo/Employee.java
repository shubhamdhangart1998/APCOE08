package com.tnsif.daysix.staticdemo;



//static keyword

public class Employee {
//declare instance varibles 
	
	private String name;
	private int id ;
	
	
	//declare static varible
	
	static String companyName="TNS";


	public Employee(String name, int id) {
	
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyName=" + companyName + "]";
	}
	
	
	
	
}
