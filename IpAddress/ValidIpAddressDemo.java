package com.kn.IpAddress;

import java.util.Scanner;

public class ValidIpAddressDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ip Address = ");
		String inputString = sc.nextLine();
		ValidIpAddress validIpAddress = new ValidIpAddress();
		boolean isValid =validIpAddress.ValidIpAddress(inputString);
		if(isValid)
		{
			System.out.println("valid ip address");
		}
		else
		{
			System.out.println("not valid");
		}
		sc.close();
		
	}

}
