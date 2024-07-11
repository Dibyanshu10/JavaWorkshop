package com.Dibyanshu.PracticeProjects;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display();

	}// end main
	public static void Display()
	{
		for(int i = 1; i<=3; i++)
		{
			for(int j = 1; j<=3; j++)
			{
				if(j == 1) {
					if(i != 3) {
						System.out.print("_");	
					}else {
						System.out.print(" ");
					}
					continue;
				}else {
					System.out.print("|");
					if(i != 3) {
						System.out.print("_");	
					}else {
						System.out.print(" ");
					}
					
				}
				
				
			}
			System.out.println();
			
		}
	}

}
