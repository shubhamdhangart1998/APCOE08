package com.tnsif.daytwo.decisionmaking;

public class NestedIfElseDemo {

	public static void main(String[] args) {

		
		int a=20, b=100, c=5;
		System.out.println("tghe largest no is :");
		
		
		if (a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(c>b)
			{
				System.out.println(c);

			}
			else {
				System.out.println(b);
			}
			
		}
		
	}

}
