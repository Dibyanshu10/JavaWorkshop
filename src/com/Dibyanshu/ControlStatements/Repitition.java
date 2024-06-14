 package com.Dibyanshu.ControlStatements;

import java.util.Scanner;

public class Repitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Sum fun !!");
		
		System.out.println("Enter a non negative integer");
		System.out.println("Or negative number to exit !!");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>=0) {
			sum = sum+num;
			System.out.println("Enter a non negative integer");
			System.out.println("Or negative number to exit !!");
		    num = sc.nextInt();	    
		} 
		System.out.println("Sum of numbers you have entered is : "+sum);
		sc.close();
	}// end main

}
