package com.tnsif.dayfive.hierachicalinheritance;

public class HieraDemo {

	public static void main(String[] args) {

		Person p=new Person();  //tight coupling
		System.out.println("person class object...........................");
		
		System.out.println(p);
		
		//Employee e =new Employee();
		
		//dynamic binding //runtime polymorphism  //loose coupling 
		
		Person p1;
		
		p1=new  Person("Shubham", "Mumbai", 30);
		if(p1 instanceof Person )
			
			System.out.println(p1);

		p1=new Student("Abhijeet", "nashik", 23, 101, "IT", "APCOE");
        if(p1 instanceof Person )
			
			System.out.println(p1);
        
        p1=new Employee("Anushka", "Delhi", 22, 1002, "TNS", "Developer", 234567);
        if(p1 instanceof Person )
			
			System.out.println(p1);


		
		
		
	}

}
