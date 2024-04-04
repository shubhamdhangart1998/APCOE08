package com.tnsif.daythree.constructordemo;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name, city;
		int id ;
		System.out.println("Enter Customer id :");
		id=sc.nextInt();
		
		
		sc.nextLine();
		System.out.println("ENter Customer Name :");
		name=sc.nextLine();
		
		System.out.println("Enter Customer city :");
		city=sc.nextLine();
		
		
		
		System.out.println(" ");
		
		
		Customer c1=new Customer();  //default constructor invoked 
	
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		
//		System.out.println(c1.getCustomerCity());
//		System.out.println(c1.getCustomerId());
//		System.out.println(c1.getCustomerName());
		
		System.out.println("Enter Customer id :");
		id=sc.nextInt();
		
		
		sc.nextLine();
		System.out.println("ENter Customer Name :");
		name=sc.nextLine();
		
		System.out.println("Enter Customer city :");
		city=sc.nextLine();
		
		Customer c2=new Customer(name, id, city);
		System.out.println(c2);
		
		
		
	}

}
