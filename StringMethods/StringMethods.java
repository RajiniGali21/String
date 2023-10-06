package com.kn.StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Rama";
		System.out.println("****Upper case****");
		String s2 = (s1.toUpperCase());
//		s1=s1.toUpperCase();
		{
			System.out.println("S2=" +s2);
//			System.out.println("S1 = "+s1);
		}
		System.out.println("===================");
		System.out.println("****Lower case****");
		String s3 = (s1.toLowerCase());
		{
			System.out.println("S3=" +s3);
		}
		System.out.println("===================");
		System.out.println("****Character at given index****");
		char s4 = (s1.charAt(2));
		{
			System.out.println("S4=" +s4);
		}
		System.out.println("===================");
		System.out.println("****Index of given Character first time****");
		int s5 = (s1.indexOf('a'));
		{
			System.out.println("S5=" +s5);
		}
		System.out.println("===================");
		System.out.println("****Index of given character last time****");
		int s6 = (s1.lastIndexOf('a'));
		{
			System.out.println("S6=" +s6);
		}
		System.out.println("===================");
		System.out.println("****Index of given character last time****");
		String s7 = (s1.substring(2));
		{
			System.out.println("S7=" +s7);
		}
		System.out.println("****Index of given character last time****");
		String s8 = (s1.substring(1,3));
		{
			System.out.println("S8=" +s8);
		}

		System.out.println("****Checking the String contains are not****");
		boolean s9 = (s1.contains("Ram"));
		{
			System.out.println("S9=" +s9);
		}


		
	

	}

}
