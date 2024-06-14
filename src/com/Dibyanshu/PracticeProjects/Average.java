package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Finding Average of numbers based upon user input !!");
		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		
		System.out.println("Caluclating the average of entered numbers !!");
		
		double avg = (num1+num2+num3)/3;
		
		System.out.println("Average of entered number is : "+avg);
		
		sc.close();

	}

}
