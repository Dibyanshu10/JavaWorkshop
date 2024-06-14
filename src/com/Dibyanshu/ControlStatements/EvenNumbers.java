package com.Dibyanshu.ControlStatements;

import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to printing even numbers");
		
		System.out.println("Enter the number till you want to print all even numbers !");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			if(i%2==0)
			{
				System.out.print(i+", ");
			}
		}	
	}
}
