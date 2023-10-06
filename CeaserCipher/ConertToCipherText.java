package com.kn.CeaserCipher;

public class ConertToCipherText {

	public String ToCipherText(String inputString, int n)
	{
		
		char[] crr = inputString.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>=65 && crr[i]<=90)
			{
				if(crr[i]+n<=90)
				{
					crr[i]=(char)(crr[i]+n);
				}
				else
				{
					crr[i]=(char)(crr[i]-26+n);
				}
			}
			
			else if(crr[i]>=97 && crr[i]<=122)
			{
				if(crr[i]+n<=122)
				{
					crr[i]=(char)(crr[i]+n);
				}
				else
				{
					crr[i]=(char)(crr[i]-26+n);
				}
			}		
		}
		StringBuffer c = new StringBuffer(" ");
		for(int i=0;i<crr.length;i++)
			{
			c.append(crr[i]);
			}
		inputString=c.toString();
			
		return inputString;
	}
	}
