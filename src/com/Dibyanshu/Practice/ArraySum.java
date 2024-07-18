package com.Dibyanshu.Practice;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculating sum of Array elements
		int[] ar  = { 2, 4, 6, 7, 9};
		
		int sum = 0;
		for(int i = 0; i<ar.length; i++)
		{
			sum = sum + ar[i];
		}
		
		System.out.println("Sum of elements of array is : "+sum);

	}

}
