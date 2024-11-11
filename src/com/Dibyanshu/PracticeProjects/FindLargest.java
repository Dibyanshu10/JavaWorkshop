package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Finding the largest number based upon user input !!");
		System.out.println("Enter the number of inputs : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		int count = 1;
		int largest = ar[0];

		if (n > 0) {
			for (int i = 0; i < ar.length; i++) {
				System.out.println("Enter " + count + " input : ");
				int num = sc.nextInt();
				ar[i] = num;
				count++;
			}
		} else {
			System.err.println("Enter Valid input !!");
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > largest) {
				largest = ar[i];
			}
		}
		System.out.println("Largest number among the input is : " + largest);
		sc.close();

	}

}
