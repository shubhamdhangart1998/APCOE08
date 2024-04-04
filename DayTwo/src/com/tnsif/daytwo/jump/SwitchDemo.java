package com.tnsif.daytwo.jump;

public class SwitchDemo {

	public static void main(String[] args) {

		
		char x='W';
		
		
		switch(x)
		{
		case'l':
		case'L':
			System.out.println(x+" for lion");
			break;
			
		case 'd':
		case 'D':
			System.out.println(x+" for Dog");
			break;
			
		case 'w':
		case 'W':
			System.out.println(x+" for Wolf");
			break;
			
		case 'p':
		case 'P':
			System.out.println(x+" for Panda");
			break;
			
		case 's':
		case 'S':
			System.out.println(x+" for Ship");
			break;
			
			default:
				System.out.println(x+" is other letter which "
						+ "is not included in the code ");
			
		}
	}

}
