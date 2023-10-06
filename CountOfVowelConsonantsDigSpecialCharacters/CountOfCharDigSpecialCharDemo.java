package com.kn.CountOfVowelConsonantsDigSpecialCharacters;

import java.util.Scanner;


public class CountOfCharDigSpecialCharDemo {

	public static void main(String[] args)
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
//		Create a object
		CountOfCharDigSpecialChar countOfCharDigSpecialChar = new CountOfCharDigSpecialChar();
//		Method to call
		countOfCharDigSpecialChar.printCountOfAll(inputString);
		
//		print the output
//		Release resources
		scan.close();
		
	}
}
