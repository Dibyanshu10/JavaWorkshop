package com.Dibyanshu.ControlStatements;

public class Selection {
	
	public static void main(String[] args) {
		
		int age;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Welcome to pub and Grille !!");
		
		System.out.println("Enter your age !!");
		age = sc.nextInt();
		
		if(age >= 21)
		{
			System.out.println("Here, have a beer !!");
		}
		else if(age>=16 && age<=21)
		{
			System.out.println("Here, have a coke !!");
			System.out.println("And, you can drive !!");
		}
		else
		{
			System.out.println("Here, have a Coke !!");
		}
		System.out.println("Thanks for coming to the Pub and Grille !!");
		
		sc.close();
	}// end main

}
