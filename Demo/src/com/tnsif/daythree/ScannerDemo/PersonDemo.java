package com.tnsif.daythree.ScannerDemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		
		//scanner object to accept user input
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name:");
		name=ob.next();
		System.out.println("Enter age");
		int age=ob.nextInt();
		System.out.println("Enter Income ");
		int income =ob.nextInt();
		System.out.println("enter gender");
		String gender=ob.next();
		
		//person object and initialize values using setter
		Person person=new Person();
		person.setName(name);
		person.setIncome(income);
		person.setAge(age);
		person.setGender(gender);
		
		//display person details using toString() method 
		System.out.println(person);
		
		TaxCalculation tc=new TaxCalculation();
		tc.calculateTax(person);
		System.out.println("After calculating tax :");
		System.out.println(person);
		
		
	}

}
