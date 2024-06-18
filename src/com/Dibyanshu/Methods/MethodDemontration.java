package com.Dibyanshu.Methods;

import java.util.Scanner;

public class MethodDemontration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printHello();
		printNum(10); //argument 10 is passed in
		int result = returnNum();
		System.out.println(result);
		int res = returnSum(10,5); //argument 10 and 5 is passed in 
		System.out.println(res);
		
		//Challenge part from video
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to be squared !!");
		double num = sc.nextDouble();
		double squareResult = returnSquare(num);
		System.out.println("The square of number entered is : "+squareResult);
		//or
		System.out.println("The square of number entered is : "+returnSquare(num));
		
		sc.close();

	}//end main
	
	/*Note:
	 * There is difference between argument and parameters
	 * When the method is created the values passed in are parameters.
	 * But when the same method is called with expected values to pass,then it is called an argument.
	 */
	
	
	
	//void, parameterless method
	public static void printHello()
	{
		System.out.println("Hello World !!");
	}
	
	//void, parameterized method
	public static void printNum(int a) //parameter a is passed
	{
		System.out.println("Number multiplied by 2 is : "+a*2);
	}
	
	//value returning, parameterless
	public static int returnNum()
	{
		return 10;
	}
	
	//value returning, parameterized
	public static int returnSum(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public static double returnSquare(double num)
	{
		double square = num * num;
		return square;
	}

}
