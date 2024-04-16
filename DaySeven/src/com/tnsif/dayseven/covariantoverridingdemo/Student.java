package com.tnsif.dayseven.covariantoverridingdemo;

public class Student implements Cloneable {

	
	//declare data members
	
	int rollNo;
	String name;
	String branch;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int rollNo, String name, String branch) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	
	
	
	public void print()
	{
		System.out.println("Name : "+name +"rollno : "+rollNo +"branch : "+branch );
	}
	
	public Student clone() throws CloneNotSupportedException
	{
		return (Student)super.clone();
	}
	
}
