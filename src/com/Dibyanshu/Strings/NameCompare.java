package com.Dibyanshu.Strings;

public class NameCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName = "Dibyanshu Singh";
		String name = "Satya Prakash";
		
		if(myName.compareToIgnoreCase(name)>0)
		{
			System.out.println("My name is greater than Satya's !!");
		}
		else
		{
			System.out.println("Satya's name is greater than mine !!");
		}

	}

}
