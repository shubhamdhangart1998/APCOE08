package com.tnsif.dayfour.firstpackage;

public class Base {

	
	//declare default,public,protected, private variables 
	
	int varDefault=10;
	public int  varPublic=20;
	protected int varProtected=30;
	private int  varPrivate=40;

	//declare default,public,protected, private methods
	
	void methodDefault()
	{
		System.out.println("Default access Base Class");
		System.out.println("default varibles: "+ varDefault);
	}
	
	 public void methodPublic()
	{
		System.out.println("Public access Base Class");
		System.out.println("Public  varibles: "+ varPublic);
	}
	 
	private void methodprivate()
		{
			System.out.println("private access Base Class");
			System.out.println("private varibles: "+ varPrivate);
		}
	
	protected void methodprotected()
	{
		System.out.println("protected access Base Class");
		System.out.println("protected varibles: "+ varProtected);
	}
	
	
}
