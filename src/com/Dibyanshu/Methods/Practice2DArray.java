package com.Dibyanshu.Methods;

import java.util.Scanner;
import java.util.Random;

public class Practice2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to custom Matrix generataion !!");
		
		System.out.print("Please enter the number of rows you want : ");
		int rows = sc.nextInt();
		
		System.out.print("Please enter the number of rows you want : ");
		int columns = sc.nextInt();
		
		System.out.print("Please enter the upper range of number till you want value in the matrix : ");
		int n = sc.nextInt();
		
		int[][] ar = new int[rows][columns];
		
		for(int i =0; i<ar.length; i++)
		{
			for(int j =0; j<ar[i].length; j++)
			{
				ar[i][j] = generateRandom(n);
			}
		}
		printArray(ar);
		

	}// end main
	
	public static int generateRandom(int n)
	{
		Random random = new Random();
		int num = random.nextInt(n)+1;
		return num;
	}
	
	public static void printArray(int[][] ar)
	{
		System.out.println("Formulated Matrix is :");
		for (int[] ar1 : ar) {
			for (int num : ar1) {
				System.out.print(num + " ");
			}
			System.out.println();// to change the line after completion of inner for loop
		}
	}

}
