package com.Dibyanshu.ControlStatements;

import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to dice simulation !!");
		
		System.out.println("Enter the number of times you want to roll the dice !!");
		int n = sc.nextInt();
		
		if(n>0)
		{
			System.out.println("Printing "+n+" random numbers !!");
			Random random = new Random();
			
			for(int i = 1; i<=n; i++)
			{
				int randoNumber = random.nextInt(6) + 1;
				System.out.print(randoNumber+" ");
			}
		}
		else
		{
			System.out.println("Please enter a valid positive number !!");
		}
      sc.close();
	}// end main

}
