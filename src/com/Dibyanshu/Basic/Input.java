package com.Dibyanshu.Basic;

import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		sc.nextLine();
		num = num * 2;
				
		System.out.println("Enter your City");
		String city = sc.nextLine();
		
		System.out.println("Entered City is "+ city);
		System.out.println("Entered Number multiplied by 2 is "+num);
		
		sc.close();

	}

}
