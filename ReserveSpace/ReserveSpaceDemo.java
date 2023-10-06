package com.kn.ReserveSpace;

import java.util.Scanner;


public class ReserveSpaceDemo {

	public static void main(String[] args)
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
//		Create a object
		ReserveSpace reserveSpace = new ReserveSpace();
//		Method to call
		char[] output = reserveSpace.ReserveSpace1(inputString);
//		print the output
		System.out.println("reversed string = "+output);
//		Release resources
		scan.close();
	}	
	}



	


