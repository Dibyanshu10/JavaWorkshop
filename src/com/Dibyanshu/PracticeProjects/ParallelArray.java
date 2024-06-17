package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;
import java.util.ArrayList;

public class ParallelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to data logging !!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of people data you want to log : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> nameList = new ArrayList<>(n);
		ArrayList<Integer> ageList = new ArrayList<>(n);
		
		for(int i=1; i<=n; i++)
		{
			System.out.println("Person "+i+" Data");
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			if(name!=null && !name.isEmpty())
			{
				nameList.add(name);
			}
			else
			{
				nameList.add("N.A.");
			}
			
			System.out.print("Enter age : ");
			String ageInput = sc.nextLine();
			if(ageInput!=null && !ageInput.isEmpty())
			{
				ageList.add(Integer.parseInt(ageInput));
			}
			else
			{
				System.out.println("Invalid age, setting age to 0");
				ageList.add(0);	
			}
			
		}
		
		System.out.println("The data results are as follows :");
		for(int i = 0; i<nameList.size(); i++)
		{
			System.out.println(nameList.get(i)+" is "+ageList.get(i)+" years old");
		}
		sc.close();

	}//end main
}
