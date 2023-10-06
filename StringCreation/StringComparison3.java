package com.kn.StringCreation;

public class StringComparison3 
{
public static void main(String[] args) 
	{
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram"+"Sita";
		String s4 = "Ram"+"Sita";
		if(s3==s4)
		{
			System.out.println("Reference are same ");
		}
		else
		{
			
			System.out.println("Reference are different");
		}
			if(s3.equals(s4))
		{
		System.out.println("String data  are same ");	
		}
			else
			{
				System.out.println("String data are different ");
			}
	}
}
