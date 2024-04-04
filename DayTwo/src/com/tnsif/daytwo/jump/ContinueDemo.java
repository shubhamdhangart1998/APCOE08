package com.tnsif.daytwo.jump;

public class ContinueDemo {

	public static void main(String[] args) {

		for (int k=5; k<15; k++)
		{
			//odd no are skip
			
			if(k%2 !=0)
				continue;
			
			//Even no are printed
			System.out.println(k+ " ");
			
		}
		
	}

}
