package com.kn.StringPalindrome;

import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) 
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
//		Create a object
		PalindromeString palindromeString = new PalindromeString();
//		Method to call
		String outputString = palindromeString.isPalindromeString1(inputString);
//		print the output
		if(inputString.equals(outputString))
		{
		System.out.println("given string is palindrome number");
		}
		else
		{
			System.out.println("given string is not a palindrome number");
		}
//		Release resources
		scan.close();
		
	}
}

