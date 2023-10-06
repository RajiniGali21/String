package com.kn.CountOfCharacters;

public class CountChar {

public void CountChar1(String inputString) 
	{
		 char[] arr = inputString.toCharArray();
		 arr = checkSorting(arr);
		 System.out.print("After swapping = ");
		 for(char i:arr)
		 System.out.print(i+"");
		 System.out.println();
		 int count=1;
		 for(int i=0;i<arr.length-1;i++)
		 {
			 if(arr[i]==arr[i+1])
			 {
				 count++;
			 }
			 else 
			 {
				 System.out.println(arr[i]+" occured "+count+" times");
				 count = 1;
			 }
			 if(i+1==arr.length-1)
			 {
				 System.out.println(arr[i]+" occured "+count+" times");
			 }
		 }

	}

	private char[] checkSorting(char[] arr) 
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
	
	
	


