package com.kn.CountOfCharacters;

import java.util.Scanner;


public class CountCharDemo {

	public static void main(String[] args)
	{
//		taken input strings to check anagram or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string = ");
		String inputString = scan.nextLine();
//		create a object
		CountChar count = new CountChar();
		
//		method to call strings to check given string is anagram or not
		count.CountChar1(inputString);
//		Release resources
		scan.close();
	}

}
