package com.kn.StringReverse;

public class ReverseString {

public String ReverseString1(String inputString) 
{
//	method to reverse the string
	char[] crr = inputString.toCharArray();
	StringBuffer reverseString = new StringBuffer();
	for(int i=crr.length-1;i>=0;i--)
	{
		reverseString = reverseString.append(crr[i]);
	}
	String reverseString2 = reverseString.toString();
	return reverseString2;
	}
}
		
	


