package com.tnsif.daytwo.decisionmaking;

public class operatoedemo {

	public static void main(String[] args) {

		int a= 10;
		int b=20;
		int x=30;
		
		System.out.println("a and b value before the opeerations : "  + a + "  "+ b);
		
		//increament ++
		//decreament --
		
		++a;
		
		int c=(++a) + (--a) - (a) + (--a) + a++;
		System.out.println("c value after the operation :" + c);
		
		int d=c++ + a + b--;
		System.out.println("d value after the operations :" + d);
		
		
		
	}

}
