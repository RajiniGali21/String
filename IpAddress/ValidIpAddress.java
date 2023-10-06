package com.kn.IpAddress;

public class ValidIpAddress {

	public boolean ValidIpAddress(String inputString)
//	{
//		boolean isValid = false;
//		inputString = inputString.replace("."," ");
//		String[] s2=inputString.split(" ");
//		char[] crr;
//		int count=0;
//		if(s2.length==4)
//		{
//			for(int i=0;i<s2.length;i++)
//			{
//				crr=s2[i].toCharArray();
//				int digit=0;
//			to get individual digit
//			for(int j=s2.length-1;j>=0;j--)
//			{
//				digit=(digit*10)+crr[j]%10;
//			}
//			if(digit>=0&&digit<=255)
//			{
//				count++;
//			}
//			else
//			{
//				break;
//			}
//		}
//		if(count==s2.length)
//		{
//			isValid=true;
//		}
//	}
//		return isValid;
//
//}
//}
	{
		char[] crr = inputString.toCharArray();
		int num=0;
		int count=0;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]!='.')
			{
				num=(num*10)+(crr[i]-48);
			}
			else if(num>=0&&num<=225)
			{
				++count;
				num=0;
			}
		}
		if(num>=0 && num<=225)
		{
			count++;
		}
		if(count==4)
		{
			return true;
		}
		return false;
	}
}