package com.Dibyanshu.Methods;

import java.util.Random;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= new int[2][3];
		
		fill2DArray(arr);
		System.out.println("Printing the actual array :");
		print2DArray(arr);
		System.out.println();
		System.out.println("Printing doubling the value of each element of array :");
		twice2DArray(arr);
		print2DArray(arr);
	
	}//end main
	
	public static void fill2DArray(int[][] arr)
	{
		Random random = new Random();
		
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]= random.nextInt(100)+1;//shifting 
			}
		}
	}
	
	public static void print2DArray(int[][] arr)
	{
		for(int[] ar : arr)
		{
			for(int num : ar)
			{
				System.out.print(num+" ");
			}
			System.out.println();// to change the line after completion of inner for loop
		}
	}
	
	public static void twice2DArray(int[][] arr1)
	{
		for(int i =0; i<arr1.length; i++)
		{
			for(int j =0; j<arr1[i].length; j++)
			{
				arr1[i][j]=arr1[i][j]*2;
			}
		}
	}

}
