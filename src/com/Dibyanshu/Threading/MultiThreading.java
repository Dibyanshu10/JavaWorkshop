package com.Dibyanshu.Threading;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create objects of the class that overrides the run method
//		ThreadingSuper obj1 = new ThreadingSuper();
//		ThreadingSuper obj2 = new ThreadingSuper();
//		obj1.start();
//		obj2.start();
		
		// Another way to start multiple thread is :
		// In this case we are launching 3 threads
		for(int i =1; i<=3; i++)
		{
			ThreadingSuper obj = new ThreadingSuper(i);
			obj.start();
		}

	}

}
