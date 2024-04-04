package com.tnsif.daythree.encapsulation;

public class MainDemo {

	public static void main(String[] args) {

		//object creation 
		OOPsConceptDemo obj=new OOPsConceptDemo();
		obj.setAge(23);
		obj.setName("Abhijeet");
		obj.setSerialNum(12345);
		System.out.println(obj);
		
		System.out.println("Name "+ obj.getName()+ " SerialNum "+ obj.getSerialNum()+ " Age :" + obj.getAge());
		
		
	}

}
