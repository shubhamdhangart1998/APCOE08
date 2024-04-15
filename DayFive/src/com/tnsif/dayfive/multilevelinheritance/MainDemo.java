package com.tnsif.dayfive.multilevelinheritance;

public class MainDemo {

	public static void main(String[] args) {

		
		City c=new City();

		c.setArea(100.89f);
		c.setCapital("Delhi");
		c.setCityName("Pune");
		c.setCode(91);
		c.setCountryName("India");
		c.setCurrency("Rupees");
		c.setLanguage("Marathi");
		c.setPopulation(200000);
		c.setStateName("maharashtra");
		
		
		System.out.println(c);
	}

}
