package com.kn.StringReverse;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) 
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
//		Create a object
		ReverseString reverseString = new ReverseString();
//		Method to call
		String outputString = reverseString.ReverseString1(inputString);
//		print the output
		System.out.println("reversed string = "+outputString);
//		Release resources
		scan.close();
		
	}

}
