package com.kn.StringCreation;

public class StringComparison5 {

	public static void main(String[] args) 
	{
		String s3 = "Ram";
		String s4 = "Sita";
		String s5 = s3.concat(s4);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
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























