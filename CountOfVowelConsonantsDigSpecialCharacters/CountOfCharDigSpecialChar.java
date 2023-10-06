package com.kn.CountOfVowelConsonantsDigSpecialCharacters;

public class CountOfCharDigSpecialChar
{

	public void printCountOfAll(String string) 
	{
		char[] crr = string.toCharArray();
		int uppercasevowel =0;
		int uppercaseconsonant =0;
		int lowercasevowel =0;
		int lowercaseconsonant =0;
		int digit =0;
		int spaces =0;
		int specialcharacters =0;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>=65 && crr[i]<=90)
			{
				if(crr[i]=='A'||crr[i]=='E'||crr[i]=='I'||crr[i]=='O'||crr[i]=='u')
				{
					uppercasevowel++;
					
				}
				else
				{
					uppercaseconsonant++;
				}
			}
			else if(crr[i]>=97 && crr[i]<=122)
			{
				if(crr[i]=='a'||crr[i]=='e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u')
				{
					lowercasevowel++;
				}
				else
				{
					lowercaseconsonant++;
				}
			}
			else if(crr[i]>=48 && crr[i]<=57)
			{
					digit++;
			}
			else if(crr[i]==' ')
			{
				spaces++;
			}
			else 
			{
				specialcharacters++;
			}
		}
			System.out.println("vowels in uppercase = "+uppercasevowel);
			System.out.println("consonants in uppercase = "+uppercaseconsonant);
			System.out.println("vowels in uppercase = "+lowercasevowel);
			System.out.println("consonants in lowercase = "+lowercaseconsonant);
			System.out.println("digits in given string = "+digit);
			System.out.println("spaces in given string = "+spaces);
			System.out.println("special characters in given string = "+specialcharacters);
		}
	}

	


				
		

