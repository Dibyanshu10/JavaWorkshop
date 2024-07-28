package com.Dibyanshu.OOP;

public class HouseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House myHouse = new House();
		House yourHouse = new House(3,10,"Blue");
		
		myHouse.setNumStories(2);
		myHouse.setNumWindows(10);
		myHouse.setColor("Off White");
		
//		yourHouse.setNumStories(3);
//		yourHouse.setNumWindows(8);
//		yourHouse.setColor("White");	
		
		printHouseData(myHouse);
		printHouseData(yourHouse);
		
	}// end main
	public static void printHouseData(House house) {
		System.out.println("The house Color is "+house.getColor()+ " and number of stories is "+house.getNumStories()+ 
				" and number of windows is "+house.getNumWindows());
		System.out.println();
	}

}
