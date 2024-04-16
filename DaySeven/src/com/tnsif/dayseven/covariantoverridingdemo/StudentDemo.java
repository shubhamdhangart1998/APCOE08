package com.tnsif.dayseven.covariantoverridingdemo;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1= new Student(101, "Aakash", "CSE");
		s1.print();
		
		Student s2=(Student)s1.clone();
		s2.setName("shubham");
		s2.setBranch("IT");
		s2.setRollNo(102);
		s2.print();
	}

}
