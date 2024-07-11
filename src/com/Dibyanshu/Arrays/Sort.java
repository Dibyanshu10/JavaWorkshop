package com.Dibyanshu.Arrays;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Sorting !!");
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
		System.out.println("The inputs are being sorted !!");
		
		//Bubble sort
		int temp = 0;
		for(int i = 0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
				{
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Sorted input values :");
		for(int number : ar)
		{
			System.out.println(number);
		}
		sc.close();
				
	}// end main

}
