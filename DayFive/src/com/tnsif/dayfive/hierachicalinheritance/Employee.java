package com.tnsif.dayfive.hierachicalinheritance;


//child of person
public class Employee extends Person {

	
	//data member
	private int empid;
	private String companyName;
	private String designation;
	private float salary;
	
	
	public Employee() {
		super();
		System.out.println("Employee constructor ");
	}


	public Employee(String name, String city, int age,int empid, String companyName, String designation, float salary) {
		super(name, city, age);
		this.empid = empid;
		this.companyName = companyName;
		this.designation = designation;
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", companyName=" + companyName + ", designation=" + designation
				+ ", salary=" + salary + ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()="
				+ getAge() + "]";
	}
	
	
	
	
	
	
	
	
}
