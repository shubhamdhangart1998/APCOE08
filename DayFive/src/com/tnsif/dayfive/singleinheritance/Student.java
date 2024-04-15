package com.tnsif.dayfive.singleinheritance;

public class Student extends Citizen {

	
	//data members
	
	private int rollNo;
	private String collegeName;
	private String branch;
	
	
	//default const
	public Student() {
		System.out.println("Student object created ");
	}


	public Student(String name, int id, String address, String birthPlace,int rollNo, String collegeName, String branch) {
		super( name, id, address, birthPlace);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
		this.branch = branch;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", branch=" + branch + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getAddress()=" + getAddress() + ", getBirthPlace()="
				+ getBirthPlace() + "]";
	}
	
	
	
	
	
	
}
