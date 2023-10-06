package com.kn.UpperToLowerToUpper;

public class UpperToLowerToUpper {

	public void UpperToLowerToUpper1(String inputString)
	{
		// TODO Auto-generated method stub
		System.out.println("resultant string = ");
		String[] srr = inputString.split(" ");
//		StringBuffer sb = new StringBuffer();
		for(String s:srr)
		{
//			System.out.print(s+" ");
			char[] crr = s.toCharArray();
			
			for(int i=0;i<crr.length;i++)
			{
				if(crr[i]>=95 && crr[i]<=122)
				{
					crr[i]  = (char)(crr[i]-32);
					System.out.print(crr[i]+" ");
				}
				else if(crr[i]>=65 && crr[i]<=90)
				{
					crr[i]=(char)(crr[i]+32);
			System.out.print(crr[i]+" ");
				}
			}
		}
	}
}
			


