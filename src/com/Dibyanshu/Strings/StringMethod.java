package com.Dibyanshu.Strings;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Dibyanshu Singh";
		String str2 = "Dibyanshu Singh";
		String str3 = "Prateek Pandey";
		
		for(int i=0; i<str1.length(); i++)
		{
			System.out.print(str1.charAt(i)+" ");
		}
		System.out.println();
		
		if(str1.equals(str2))
		{
			System.out.println("Names are equal !!");
		}
		else
		{
			System.out.println("Names are not equal !!");
		}
		if(str1.compareTo(str3)>0)
		{
			System.out.println("Str 1 > Str3");
		}
		else
		{
			System.out.println("Str 1 less than equal to Str3");
		}
		
	}

}
