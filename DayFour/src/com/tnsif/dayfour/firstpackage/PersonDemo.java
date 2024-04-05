package com.tnsif.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		
		Person p=new Person();  // default constructor invoked 
		
		
		Scanner sc=new Scanner(System.in );
		String name, city;
		int age;
		System.out.println("Enter person details : Name, Age, City ");
		
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		city=sc.nextLine();
		
		p.setPersonName(name);
		p.setPersonAge(age);
		p.setPersonCity(city);
		System.out.println("person Detraiuls Name : "+p.getPersonName() +
				"\tAge :" + p.getPersonAge()+ "\tCity :" + p.getPersonCity() );
		
       System.out.println("Enter person details : Name, Age, City ");
		
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		city=sc.nextLine();
		
		Person p1=new Person(name, age, city);  // paramiterized constructor will be invoked 
		System.out.println("person Detraiuls Name : "+p1.getPersonName() +
				"\tAge :" + p1.getPersonAge()+ "\tCity :" + p1.getPersonCity() );
		
		sc.close();
		
	}

}
