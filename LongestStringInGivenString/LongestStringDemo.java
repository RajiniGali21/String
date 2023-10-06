package com.kn.LongestStringInGivenString;

import java.util.Scanner;


public class LongestStringDemo {

	public static void main(String[] args)
	{
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
		//		Create a object
		LongestStringInGivenString longestStringInGivenString = new LongestStringInGivenString();
//		Method to call
		 longestStringInGivenString.printLongestStringInGivenString(inputString);
		
//		print the output
//		Release resources
		scan.close();
		
	}

}

	


