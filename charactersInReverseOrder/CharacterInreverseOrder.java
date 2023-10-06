package com.kn.charactersInReverseOrder;

public class CharacterInreverseOrder {
//	method to reverse the string
	public void printReverseCharactersInString(String inputstring)
	{
		{
			String[] srr = inputstring.split(" ");
			for(int i=0;i<srr.length;i++)
			{
		    printReverse(srr[i]);
			}
		}
	}
 public void printReverse(String srr) 
	{
		char[] crr =srr.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]+" ");
		}
	
	
}
}


