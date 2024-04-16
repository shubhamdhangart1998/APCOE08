package com.tnsif.dayseven.complitetimedemo;

public class Methodoverloadingdemo {

	
	//method1
	public static int addition(int a, int b)
	{
		return a+b;
	}
	
	//method2
	public static float addition(int a, float b)
	{
		return a+b;
	}
	
	//method3
		public static float addition(float a, float b)
		{
			return a+b;
		}
		
		
		//method4
		public static float addition(float a, int b)
		{
			return a+b;
		}
	
		//method5
		public static float addition(int a, float b, int c)
		{
			return a+b+c;
		}
}
