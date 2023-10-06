package com.kn.StringPalindrome;

public class PalindromeString {

	public String isPalindromeString1(String inputString)
	{
//		Method to return the given string is palindrome or not 
		char[] crr = inputString.toCharArray();
		StringBuffer palindromeString = new StringBuffer();
		for(int i=crr.length-1;i>=0;i--)
		{
			palindromeString = palindromeString.append(crr[i]);
		}
		String palindromeString2 = palindromeString.toString();
		return palindromeString2;
	}

}
