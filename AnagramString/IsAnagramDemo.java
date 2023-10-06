package com.kn.AnagramString;

import java.util.Scanner;


public class IsAnagramDemo {
	

	public static void main(String[] args) 
	{
//		taken input strings to check anagram or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two strings = ");
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
//		create a object
		IsAnagram isAnagram = new IsAnagram();
//		method to call strings to check given string is anagram or not
		boolean OutputString = isAnagram.IsAnagram1(str1,str2);
		if(OutputString)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
		scan.close();
		
//		 char[] arr1 = str1.toCharArray();
//		 char[] arr2 = str2.toCharArray();
//		 System.out.println(Arrays.toString(arr1));
//		 System.out.println(Arrays.toString(arr2));
//		 Arrays.sort(arr1);
//		 Arrays.sort(arr2);
//		 System.out.println(Arrays.toString(arr1));
//		 System.out.println(Arrays.toString(arr2));
//		 if(Arrays.equals(arr1, arr2))
//		 {
//			 System.out.println("Anagram");
//		 }
//		 else
//		 {
//			 System.out.println("not anagram");
//		 }
//		}
	}


}
