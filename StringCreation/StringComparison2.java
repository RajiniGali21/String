package com.kn.StringCreation;

import java.util.Scanner;

public class StringComparison2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string1 = ");
		String s1 = new String(scan.next());
		System.out.println("enter the string2 = ");
		String s2 = new String(scan.next());
		if(s1==s2)
		{
			System.out.println("reference are same ");
		}
		else
		{
			System.out.println("Reference are different");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings are same ");
		}
		else
		{
			System.out.println("Strings are different");
		}
		scan.close();
	}

}
