package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;
import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to reverse printing !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of non-negative input you want in list !!");
		int n = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<>(n);
		int c = 1;
		
		for(int i =1; i<=n; i++)
		{
			System.out.print("Enter non-negative Value "+c+": ");
			int num = sc.nextInt();
			if(num>0)
			{
				ar.add(num);
				c++;
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Value entered in reverse order :");
		for(int i = ar.size()-1; i>=0; i--)
		{
			System.out.print(ar.get(i)+" ");
		}
		sc.close();
			
	}//end main

}
