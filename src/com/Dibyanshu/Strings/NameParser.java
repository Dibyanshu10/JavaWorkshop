package com.Dibyanshu.Strings;

import java.util.Scanner;

public class NameParser {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name : ");
		String fullName = sc.nextLine();		
		
		int index = fullName.indexOf(" ");
		
		String firstName = fullName.substring(0, index);
		String lastName = fullName.substring(index+1);
		
		System.out.print("First Name is : "+firstName.toUpperCase());
		System.out.println();
		System.out.print("Last Name is : "+lastName.toLowerCase());
		
		sc.close();
	}// end main

}
