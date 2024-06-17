package com.Dibyanshu.PracticeProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1; //random number between 1-100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to number guess fun !!");
		int counter = 1;
		
		while(true)
		{
			System.out.println("Please enter your guess to match the Computer's guess !!");
			int n = sc.nextInt();
			
			if(n==randomNumber)
			{
				System.out.println("congrats !! You have guessed the number in "+counter+" times !!");
				break;
			}
			else if(n<=randomNumber)
			{
				System.out.println("Guess Higher !! ");
			}
			else if(n>100)
			{
				System.out.println("Wasted guess !! Please guess between 1 - 100 ");
			}
			else
			{
				System.out.println("Guess Lower !!");
			}
			counter++;
		}
		sc.close();

	}// end main

}
