package com.tnsif.dayseven.complitetimedemo;

public class Overloadingdemo {

	public static void main(String[] args) {

		
		Point p=new Point();
		System.out.println(p);
		
		
		Point p1=new Point(2.3f, 3.4f);
		System.out.println(p1);
		
		Methodoverloadingdemo m=new Methodoverloadingdemo();
		System.out.println(m.addition(23, 23));
		System.out.println(m.addition(23.34f, 1234.32f));
		
	}

}
