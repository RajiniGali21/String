package com.kn.MutableStrings;

public class StringBuilderDemo {

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Ram");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("***************");
		sb1.append("Sita");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}

}
