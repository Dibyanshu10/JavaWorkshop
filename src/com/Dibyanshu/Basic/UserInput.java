package com.Dibyanshu.Basic;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyInput = new Scanner(System.in);
		String name;
		String city;
		int age;
		
		System.out.println("What is your name? ");
		name = keyInput.nextLine();
		
		System.out.println("What is your age? ");
		age= keyInput.nextInt();
		keyInput.nextLine(); //consume the next line
		
		System.out.println("What is your City? ");
		city= keyInput.nextLine();
		
		System.out.println("Hello, "+name+" !!");
		System.out.println("You are "+age+" !!");
		System.out.println("Your City is "+city+" !!");
		
		keyInput.close();

	}

}
