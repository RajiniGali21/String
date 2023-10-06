package com.kn.LongestStringInGivenString;

public class LongestStringInGivenString 
{
public void printLongestStringInGivenString(String inputString) 
{
	String[] word = inputString.split(" ");
	int max=0;
	String longestword=" ";
	for(int i=0;i<word.length;i++)
	{
		if(word[i].length()>max)
		{
			max = word[i].length();
			longestword = word[i];
			
		}
	}
	System.out.println("Longest word in given string = "+longestword);
	System.out.println("Length of the longest word is ="+max);
	

}

}
