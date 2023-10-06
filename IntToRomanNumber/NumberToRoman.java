package com.kn.IntToRomanNumber;

public class NumberToRoman 
{
		

	public void IntToRoman(String[] srr, int[] arr, int num) {
		StringBuffer romanNumber = new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			while(num>=arr[i])
			{
				num=num-arr[i];
				romanNumber.append(srr[i]);
			}
		}
	System.out.println("Roman number = "+romanNumber);
}		
}
