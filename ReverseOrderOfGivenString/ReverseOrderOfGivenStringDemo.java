package com.kn.ReverseOrderOfGivenString;

import java.util.Scanner;


public class ReverseOrderOfGivenStringDemo {

	public static void main(String[] args) 
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
//		print the output
		System.out.println("reversed string = ");

//		Create a object
		ReverseOrderOfString reverseString = new ReverseOrderOfString();
//		Method to call
		 reverseString.ReverseOrderOfString1(inputString);
//		Release resources
		scan.close();
		
	}

}

	

