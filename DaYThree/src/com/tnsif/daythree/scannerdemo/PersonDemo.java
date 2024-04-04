package com.tnsif.daythree.scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		//scanner object to be created
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person name :");
		name=ob.next();
		System.out.println("Enter age :");
		int age =ob.nextInt();
		System.out.println("Enter Taxable income  :");
		int income =ob.nextInt();
		System.out.println("Enter gender");
		String gender=ob.next();
		
		//Person object and initialize values using setter
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		
		System.out.println(person );
		
		TaxCalculation tx=new TaxCalculation();
		tx.calculateTax(person);
		System.out.println("After calculating Tax :");
		System.out.println(person);
		
		
		
	}

}
