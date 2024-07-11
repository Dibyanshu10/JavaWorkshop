package com.Dibyanshu.PracticeProjects;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomw to Array Sum printing !!");
	
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.print("Enter number of elements you want in the array : ");
		int n = sc.nextInt();
		Random random = new Random();
		for(int i = 0; i<n; i++)
		{
			int num = random.nextInt(1000)+1;
			ar.add(num);
		}
		System.out.println("Elements of the array are :");
		for(int i = 0; i<ar.size(); i++)
		{
			System.out.print(ar.get(i)+" ");
		}
		
		System.out.println();
		System.out.print("Sum of the elements in the array list : "+getSum(ar));
		
		sc.close();

	} // end main
	
	
	public static int getSum(ArrayList<Integer> arr)
	{
		int sum = 0;
		if(arr.size()>0)
		{
			for(int i = 0; i<arr.size(); i++)
			{
				sum = sum + arr.get(i);
			}
		}
		return sum;
	}

}
