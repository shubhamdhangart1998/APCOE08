package com.tnsif.dayseven.covariantoverridingdemo;

public class Covariantmethodoverridingdemo {

	public static void main(String[] args) {

		Color c=new Color();
		System.out.println(c.getColor());
		
		Red r=new Red();
		System.out.println(r.getColor());
	
		
		Green g=new Green();
		System.out.println(g.getColor());
		
	}

}
