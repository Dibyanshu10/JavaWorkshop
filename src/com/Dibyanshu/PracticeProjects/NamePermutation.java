package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;
import java.util.ArrayList;

public class NamePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Name permutation !!"); 
		
		System.out.print("Enter the number of user data you want log : ");
		int n =sc.nextInt();// does not consume the next line character
		sc.nextLine(); // This is used so that next line character could be consumed
		
		ArrayList<String> firstName = new ArrayList<>(n);
		ArrayList<String> lastName = new ArrayList<>(n);
		
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter Full Name of User - "+i+" :");
			String name = sc.nextLine();
			if(name!="" && !name.isEmpty())
			{
				int index = name.indexOf(' ');
				if(index!=-1)// empty will return -1
				{
					firstName.add(name.substring(0,index));
					lastName.add(name.substring(index+1));
				}
				else
				{
					//in case where user has only entered his first name
					firstName.add(name);
					lastName.add("");
				}

			}
			else
			{
				firstName.add("N.A.");
				lastName.add("N.A.");
			}
		}
		System.out.println("All the name permutation available for the data entered !!");
		int count = 0;
		for(int i =0; i<firstName.size(); i++)
		{
			for(int j=0; j<lastName.size(); j++)
			{
				System.out.println(firstName.get(i)+" "+lastName.get(j));
				count++;
			}
		}
		System.out.println(count+" Number of permutation available !!");
		
		sc.close();

	}// end main

}
