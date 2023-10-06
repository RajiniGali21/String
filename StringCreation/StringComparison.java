package com.kn.StringCreation;

public class StringComparison {

	public static void main(String[] args)
	{
		String s1 = "Ram";
		String s2 = "Ram";
		if(s1==s2)
		{
			System.out.println("Reference are same ");
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
				System.out.println("Strings are different ");
			}
	}

}
