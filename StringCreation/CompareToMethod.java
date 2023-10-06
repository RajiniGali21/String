package com.kn.StringCreation;

public class CompareToMethod {

	public static void main(String[] args) 
	{
		String s1 = "Sachin";
		String s2 = "Sourav";
		System.out.println(s1.compareTo(s2));
//		System.out.println(s2.compareTo(s1));
//		if(s1.compareTo(s2)>0)
		if(s2.compareTo(s1)>0)
		{
		System.out.println("s2 is greater than s1");
		}
//		else if(s1.compareTo(s2)<0)
		else if(s2.compareTo(s1)<0)

		{
			System.out.println("S2 is less than s1");
		}
		else
		{
			System.out.println("s1 and s2 are equal lexicographically");
		}
	}
}
