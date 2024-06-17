package com.Dibyanshu.Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Sorting !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of values you want to enter !!");
		int n = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>(n);
		int c = 1;
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter Value "+c+":");
			int num = sc.nextInt();
			ar.add(num);
			c++;
		}
		System.out.println("The inputs are being sorted !!");
		Collections.sort(ar);
		
		for(int num : ar)
		{
			System.out.print(num+" ");
		}
		
		sc.close();

	}// end main

}
