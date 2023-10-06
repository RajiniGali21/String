package com.kn.StringCreation;

public class StringConcatenation {

	public static void main(String[] args) 
	{
		String s3 = "Ram";
		String s4 = "RAM";
		System.out.println("****case sensitivity****");
		if(s3.equals(s4))
		{
			System.out.println("equal");
		}
		else
		{
		System.out.println("Unequal");
		}
		System.out.println("****Ignore case Sensitivit****");
		if(s3.equalsIgnoreCase(s4))
		{
		System.out.println("Equal");	
		}
		else
		{
		System.out.println("Unequal");
		}
	}
}
			
			
