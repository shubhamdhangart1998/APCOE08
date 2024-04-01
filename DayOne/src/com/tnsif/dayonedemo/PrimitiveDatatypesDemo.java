package com.tnsif.dayonedemo;

public class PrimitiveDatatypesDemo {

	public static void main(String[] args) {

		
		//byte take 1 byte
		byte  bytemax=127;
		byte bytemin=-128;
		
		System.out.println("Min renge of byte is " + bytemin + "Max range of byte is "+ bytemax);
		
		//short take 2 byte 
		short shortmin=-32768;
		short shortmax=32767;
		
		System.out.println("Min renge of short is " + shortmin + "Max range of short is "+ shortmax);

		//int 4 byte 
		
		int intmin=-2147483648;
		int intmax=2147483647;

		System.out.println("Min renge of int is " + intmin + "Max range of int is "+ intmax);
		
		long maxlong=9223372036854775807L;
		long minlong=-9223372036854775808L;
		
		System.out.println("Min renge of long is " + minlong + "Max range of long is "+ maxlong);

		float f=3234.141243278345f;
		
		double d=3456.14124512345678914;
		System.out.println("Float value is  " + f + "Double value is "+ d);


		
		
		
	}

}

