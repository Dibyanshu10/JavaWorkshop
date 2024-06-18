package com.Dibyanshu.Methods;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDownFrom(10);
		System.out.println("");//for line change
		CountUpTo(1,10);

	}// end main
	
	public static void CountDownFrom(int n)
	{
		if(n>=0) {
			System.out.print(n+" ");
			CountDownFrom(n-1);
		}
	}
	public static void CountUpTo(int num1, int num2)
	{
		if(num1<=num2)
		{
			System.out.print(num1+" ");
			num1++;
			CountUpTo(num1,num2);
		}
	}

}
