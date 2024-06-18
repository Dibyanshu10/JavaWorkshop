package com.Dibyanshu.Strings;

public class MoreStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName = "Dibyanshu Singh";
		
		String upper = myName.toUpperCase();
		String lower = myName.toLowerCase();
		
		int index = myName.indexOf('S');
		
		String lastName = myName.substring(10);
		
		System.out.println("Name in upper case is : "+upper);
		System.out.println("Name in lower case is : "+lower);
		System.out.println("Index of character S is : "+index);
		System.out.println("Last name is : "+lastName);
		
	}// end main

}
