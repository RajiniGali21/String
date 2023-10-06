package com.kn.ValidUserName;

import java.util.Scanner;

public class ValidUserDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the user id = ");
		String username = scan.nextLine();
		ValidUser validUser = new ValidUser();
		boolean output = validUser.ValidUser1(username);
		if(output)
		{
			System.out.println("username is valid");
		}
		else
		{
			System.out.println("username is not valid");
		}
		scan.close();
	}

}
