package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;

public class DivisiblityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to divisiblity check by 3 !!");
		
		System.out.println("Enter the number you want to check :");
		String num = sc.nextLine();
		
		String regex = "-?\\d+";
		if(num.matches(regex)) {
			int n = Integer.parseInt(num);
			if(n%3==0)
			{
				System.out.println(n+" is divisible by 3 !!");
			}
			else
			{
				System.out.println(n+" is not divisible by 3 !!");
			}
		}
		else
		{
			System.err.println(num +" is not a valid input !!");
		}
		
		sc.close();

	}// end main

}
