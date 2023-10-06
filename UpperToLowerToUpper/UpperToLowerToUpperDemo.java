package com.kn.UpperToLowerToUpper;

import java.util.Scanner;


public class UpperToLowerToUpperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();

//		Create a object
		UpperToLowerToUpper upperToLowerToUpper = new UpperToLowerToUpper();
//		Method to call
		upperToLowerToUpper.UpperToLowerToUpper1(inputString);
//			print the output
//			System.out.println("string = ");

//		Release resources
		scan.close();
		
	}

}

