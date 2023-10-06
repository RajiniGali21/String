package com.kn.StringMethods;

public class StringMethodDemo {

	public static void main(String[] args) 
	{
		String s1 = "Raja Ram Mohan Roy";
		System.out.println("***Length of the given string***");
		System.out.println(s1.length());
		System.out.println("***String Starts with***");
		System.out.println(s1.startsWith("Raja"));
		System.out.println("***String Ends with***");
		System.out.println(s1.endsWith("Roy"));
		System.out.println("***Replacing the given string with start and end String***");
		System.out.println(s1.replace("Raja","Ram"));
		System.out.println("***Replacing the given string***");
		System.out.println(s1.replaceAll(s1,"Gandhiji"));
		System.out.println("**** Spliting the gievn string ****");
		String[] srr = s1.split(" ");
		for(int i=srr.length-1;i>=0;i--)
		{
		System.out.print(srr[i]+" ");
		}
		System.out.println();
		System.out.println("***Triming  the given string***");
		String s2 = new String("     raja ram mohan roy  ");
		System.out.println(s2.trim());
		System.out.println("***Convert the given String into Char Array***");
		System.out.println(s1.toCharArray());
		
		
		
		
		
		
		
		
	}

}
