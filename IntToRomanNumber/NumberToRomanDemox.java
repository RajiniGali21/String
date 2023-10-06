package com.kn.IntToRomanNumber;

import java.util.Scanner;

public class NumberToRomanDemox {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num = ");
		int num = scan.nextInt();
		String[] srr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		NumberToRoman numberToRoman = new NumberToRoman();
		numberToRoman.IntToRoman(srr,arr,num);
		scan.close();
	}
}
