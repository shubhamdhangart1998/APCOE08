package com.tnsif.dayonedemo;

public class TypeCastingDemo {

	public static void main(String[] args) {

		
		//widening 
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=100/3f;
		
		double d=f;
		System.out.println(d);
		
		
		char var1='A';
		
		int i4=var1;
		System.out.println(i4);
		
		double f1=10.5333333333333333333333333333333332f;
		
		float f45=(float) f1;
		System.out.println(f45);
		
		
//		long l=(long) f1;
//		System.out.println(l);
	}

}
