package com.Dibyanshu.Stream;

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
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //  Functional Interface : Interface with only one method
	   //  Lambda expression example
		
		Demo obj =() -> System.out.println("This is Test which implements Demo (Functional Interface) !!");
		obj.display();
				
	}

}
