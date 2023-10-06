package com.kn.FirstwordConvertToUpperCase;

import java.util.Scanner;


public class ConvertFirstCharToUpperCaseDemo {

	public static void main(String[] args)
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();

//		Create a object
		ConvertFirstCharToUpperCase convertFirstCharToUpperCase = new ConvertFirstCharToUpperCase();
//		Method to call
		String outputString = convertFirstCharToUpperCase.ConvertFirstCharToUpperCase1(inputString);
//			print the output
			System.out.println("resultant string ="+outputString);

//		Release resources
		scan.close();
		
	}

}

