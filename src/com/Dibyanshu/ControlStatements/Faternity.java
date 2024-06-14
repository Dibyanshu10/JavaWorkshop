package com.Dibyanshu.ControlStatements;

import java.util.Scanner;

public class Faternity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int age;
			char gender;
			
			System.out.println("Welcome to Faternity Organization membership registration !!");
			
			System.out.println("Enter your age !");
			age=sc.nextInt();
			
			System.out.println("Enter your gender(M/F) !");
			gender = sc.next().charAt(0);
			
			if(gender=='M' || gender=='m' || gender=='F' || gender =='f')
			{
				if(age>=19 && gender=='M' || gender=='m')
				{
					System.out.println("Welcome to Faternity Community !!");
					System.out.println("Thanks for participating !!");
				}
				else
				{
					System.out.println("Sorry, you are not eligible to join the Community !!");
					System.out.println("Thanks for participating !!");
				}

			}
			else
			{
				System.out.println("Enter expected value of Gender !!");
				System.out.println("Thanks for participating !!");
			}
			
			sc.close();
		
	}// end main

}
