package com.Dibyanshu.Practice;

import java.util.Scanner;
import java.util.Random;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Largest element in the array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to finding largest element of the Array");
		
		System.out.println("Enter the number of element you want in the array :");
		int n = sc.nextInt();
		int[] ar = new int[n];
		Random random = new Random();
		for(int i = 0; i<n; i++)
		{
			ar[i]= random.nextInt(100)+1;
		}
		
		System.out.println("Generated array is : ");
		for(int num : ar)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		int large = ar[0];
		for(int i = 0; i<ar.length; i++)
		{	
				if(ar[i]>large)
				{
					large = ar[i];
				}
		}
		System.out.println("Largest number in the array is : "+large);
		sc.close();

	}//end main

}
