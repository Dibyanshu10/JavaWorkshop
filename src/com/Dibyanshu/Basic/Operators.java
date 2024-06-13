package com.Dibyanshu.Basic;
/* 8 Primitive types in java
1. byte
2. int
3. short
4. long
5. float
6. double
7. char
8. boolean */

public class Operators {

	// Main is entry pint of the Application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge = 25;
		int yourAge = 30;
		int bobsAge = 22;
		
		String myName = "Dibyanshu";
		String yourName = "Singh";
		
		boolean ageCompare = myAge > yourAge;
		System.out.println("My Age > Your Age ? " + ageCompare);
		
		ageCompare = bobsAge < myAge;
		System.out.println("My Age > Bob's Age ? " + ageCompare);
		
		boolean nameCompare= myName.equals(yourName);
		System.out.println("My name equals your name ? "+nameCompare);
		
		boolean isRaining = false;
		boolean isWarm = true;
		
		boolean combined = isRaining && isWarm;
		System.out.println("Is it raining and warm? "+ combined);
		
		combined = isRaining || isWarm;
		System.out.println("Is it raining or warm? "+ combined);
		
		combined= !isRaining;
		System.out.println("Is is not raining? "+combined);
		
	}

}

