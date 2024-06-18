package com.Dibyanshu.Methods;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = getResults(5);
		System.out.println("Result is : "+result);
		
		result = getResults(10,10);
		System.out.println("Result is : "+result);
		
		result = getResults(10,"12");
		System.out.println("Result is : "+result);
		
		String results = getResults("Dibyanshu","Singh");
		System.out.println("Result is : "+results);

	}// end main
	
	public static int getResults(int num)
	{
		return num * 2;
	}
	
	public static int getResults(int num1, int num2)
	{
		return num1 * num2;
	}
	
	public static int getResults(int num1, String Value)
	{
		return num1 * Integer.parseInt(Value);
	}
	
	public static String getResults(String str1, String Str2)
	{
		return str1+" "+Str2;
	}

}
