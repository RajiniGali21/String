package com.kn.ReverseOrderOfGivenString;

public class ReverseOrderOfString
{
//	method to reverse the string
	
	public void ReverseOrderOfString1(String inputString) 
	{
		String[] srr = inputString.split(" ");
		for(int i=srr.length-1;i>=0;i--)
		{
			System.out.print(srr[i]+" ");
		}
	
	}
}
