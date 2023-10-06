package com.kn.MutableStrings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Ram");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append(" Sita");
		sb1.append(" Sita");
		sb1.append(" Sita");
		sb1.append(" Sita");
		System.out.println("***********");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	

	}

}
