package com.kn.charactersInReverseOrder;

import java.util.Scanner;

public class CharactersInReverseOrderDemo {

	public static void main(String[] args) {
		
//		Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string = ");
		String inputString = scan.nextLine();
//		print the output'
	System.out.println("Reversed string character are = ");
		{
			
//		Create a object
		CharacterInreverseOrder characterInReverseOrder = new CharacterInreverseOrder();
//		Method to call
		characterInReverseOrder.printReverseCharactersInString(inputString);
		
		}
//		Release resources
		scan.close();
		
	}

}

