package com.kn.AnagramString;
public class IsAnagram {

	public boolean IsAnagram1(String str1, String str2) 
	{
		boolean isAnagram =false;
		if(str1.length() == str2.length())
		{
		 char[] arr1 = str1.toCharArray();
		 char[] arr2 = str2.toCharArray();
		 arr1 = checkSorting(arr1);
		 arr2 = checkSorting(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
			else 
			{
				return true;
			}
		}
			return isAnagram;
		}
		return isAnagram;
	}
		
	

	public char[] checkSorting(char[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
		        if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	}
	
	
		
	
