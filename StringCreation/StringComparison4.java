package com.kn.StringCreation;

public class StringComparison4 {

	public static void main(String[] args)
	{
		String s1 = new String("Ram");
		String s2 = new String("Sita");
		String s3 = new String("Ram"+"Sita");
		String s4 = new String("Ram"+"Sita");
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
		System.out.println("Strings are same ");	
		}
			else
			{
				System.out.println("Strings are different ");
			}
	}
}
