package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;

public class ArrayMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to project multiplication !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of values you want to enter !!");
		int n = sc.nextInt();
		int[] ar = new int[n];
		int c = 1;
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter Value "+c+":");
			int num = sc.nextInt();
			ar[i] = num;
			c++;
		}
		System.out.println("Result :");
		for(int num : ar)
		{
			System.out.print(num*2+" ");
		}
		sc.close();

	}// end main

}
