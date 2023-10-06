package com.kn.CeaserCipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
		System.out.println("enter the number = ");
		int n = scan.nextInt();
		ConertToCipherText conertToCipherText = new ConertToCipherText();
		String outputString = conertToCipherText.ToCipherText(inputString,n);
		System.out.println("OutputString = "+outputString);
		scan.close();
	}

}
