package com.Dibyanshu.Methods;

import java.util.Scanner;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Finding prime numbers between range using recursion

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to finding prime numbers between range of numbers !!");

		System.out.print("Enter the starting range : ");
		int lr = sc.nextInt();

		System.out.print("Enter the upper range : ");
		int hr = sc.nextInt();

		if (lr > hr) {
			System.out.println("Invalid range !! Please select a valid range.");
		} else {
			System.out.println("Printing the prime numbers in the given range !! ");
			printPrime(lr, hr);
		}

		sc.close();

	}// end main

	public static void printPrime(int a, int b) {
		if (a <= b) {
			if (isPrime(a))
               System.out.print(a+" ");
			printPrime(a + 1, b);
		}
	}

	public static boolean isPrime(int a) {
		if (a <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(a); i++)
			if (a % 2 == 0)
				return false;
		return true;

	}

}
