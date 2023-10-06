package com.kn.ValidUserName;

public class ValidUser 
{

	public boolean ValidUser1(String username) {
		boolean isValid = true;
		if(username.length()>=8 && username.length()<=30)
		{
			char[] crr = username.toCharArray();
			int count=1;
			for(int i=0;i<crr.length;i++)
			{
				if(crr[i]=='_'||(crr[0]>='A' && crr[0]<='Z')||(crr[0]>='a'&&crr[0]<='z')||(crr[i]>48 && crr[i]<57))
				{
					count++;
				}
			}
			if(count==username.length())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return isValid;
	}
	}



