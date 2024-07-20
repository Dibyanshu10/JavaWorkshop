package com.Dibyanshu.Stream;

import java.util.function.Predicate;

@FunctionalInterface
interface Demo
{
	void display();
}

//class Test extends Object implements Demo
//{
//	public void display()
//	{
//		System.out.println("This is Test which implements Demo (Functional Interface)");
//	}
//}
public class LambdaExpression extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //  Functional Interface : Interface with only one method
	   //  Lambda expression example
		
		Demo obj =() -> System.out.println("This is Test which implements Demo (Functional Interface) !!");
		obj.display();
		
        int n = 10;
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(n) ? "Even Number" : "Odd Number");
				
	}

}
