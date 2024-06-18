package com.Dibyanshu.Methods;

public class MethodCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doSomething();

	}// end main
	
	public static void doSomething()
	{
		System.out.println("In doSomething() method");
		
		int result = getValue();
		System.out.println("Result is :"+result);
	}
	
	public static int getValue()
	{
		return 10;
	}

}
