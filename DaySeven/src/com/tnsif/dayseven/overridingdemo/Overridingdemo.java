package com.tnsif.dayseven.overridingdemo;

public class Overridingdemo {

	public static void main(String[] args) {

		//dynamic binding
		RBI rbi;
		
		rbi=new RBI();
		System.out.println(rbi instanceof RBI);
		
		System.out.println(rbi.getRateofInterest());
		
		rbi=new Axis();
		System.out.println(rbi instanceof Axis);
		
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi instanceof RBI);
		
		System.out.println(rbi.getRateofInterest());
		
	}

}
