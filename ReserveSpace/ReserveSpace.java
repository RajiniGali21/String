package com.kn.ReserveSpace;

public class ReserveSpace {

	 char[] ReserveSpace1(String inputString) 
	{
//		method to reverse the string
		char[] crr = inputString.toCharArray();
		char[] rrr = new char[crr.length];
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]==' ')
			{
				rrr[i]= ' ';
			}
		}
		int j=crr.length-1;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]!=' ')
			{
				if(rrr[j]==' ')
				{
					j--;
				}
				rrr[j]=crr[i];
				j--;
			}
		}
		return rrr;
	}
}
