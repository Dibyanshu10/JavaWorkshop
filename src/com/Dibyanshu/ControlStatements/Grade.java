package com.Dibyanshu.ControlStatements;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a grade !");
		char grade = sc.next().charAt(0);
		
		switch (grade) {
		case 'A': 
		case 'a':{
			
			System.out.println("You have done a great job !!");
			break;
		}
        case 'B': 
        case 'b':{
			
			System.out.println("You have done a good job !!");
			break;
		}
        case 'C': 
        case 'c':{
			
			System.out.println("You can do better !!");
			break;
		}
        case 'D': 
        case 'd':{
			
			System.out.println("You are pretty close to failing !!");
			break;
		}
        case 'F': 
        case 'f':{
			
			System.out.println("You are failing the course !!");
			break;
		}
		
		default:
			System.out.println("Unexpected value of grade: " + grade);
		}
		
		sc.close();

	}// end main

}
