package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;

public class PackagePurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Learning Package where you can purchase various courses !!");
		
		System.out.println("Enter the Package Number based upon the following information : ");
	    System.out.println("Package 1 : $10/month, includes 2 courses per month. $6 for each additional course");
	    System.out.println("Package 2 : $12/month, includes 4 courses per month. $4 for each additional course");
	    System.out.println("Package 3 : $15/month, includes 6 courses per month. $3 for each additional course");
		int n = sc.nextInt();
		
		if(n>=1 && n<=3)
		{
			switch(n)
			{
			case 1:
				System.out.println("Congrats !! You have selected Package : "+n);
				System.out.println("Please enter the number of courses you have purchased :");
				int num1 = sc.nextInt();
				int cp1 = 10;
				int additional1 = 6;
				if(num1>=1 && num1<=2)
				{
					System.out.println("Congrats ! Your total bill is $"+cp1+" Thanks for the purchase !!");
					break;
				}
				else if (num1>2)
				{
					int totalPrice1 = (num1-2)*additional1+cp1;
					System.out.println("Congrats ! Your total bill is $"+totalPrice1+". Thanks for the purchase !!");
					break;
				}
				else
				{
					System.out.println("Enter valid number of  package. "+num1+" is not a valid number !!");
					break;
				}
			case 2:
				System.out.println("Congrats !! You have selected Package : "+n);
				System.out.println("Please enter the number of courses you have purchased :");
				int num2 = sc.nextInt();
				int cp2 = 12;
				int additional2 = 4;
				if(num2>=1 && num2<=4)
				{
					System.out.println("Congrats ! Your total bill is $"+cp2+". Thanks for the purchase !!");
					break;
				}
				else if (num2>4)
				{
					int totalPrice2 = (num2-4)*additional2+cp2;
					System.out.println("Congrats ! Your total bill is $"+totalPrice2+". Thanks for the purchase !!");
					break;
				}
				else
				{
					System.out.println("Enter valid number of  package. "+num2+" is not a valid number !!");
					break;
				}
			case 3:
				System.out.println("Congrats !! You have selected Package : "+n);
				System.out.println("Please enter the number of courses you have purchased :");
				int num3 = sc.nextInt();
				int cp3 = 15;
				int additional3 = 3;
				if(num3>=1 && num3<=6)
				{
					System.out.println("Congrats! Your total bill is $"+cp3+" Thanks for the purchase !!");
					break;
				}
				else if (num3>6)
				{
					int totalPrice3 = (num3-6)*additional3+cp3;
					System.out.println("Congrats! Your total bill is $"+totalPrice3+" Thanks for the purchase !!");
					break;
				}
				else
				{
					System.out.println("Enter valid number of  package. "+num3+" is not a valid number !!");
					break;
				}


			}

		}
		else
		{
			System.out.println("Please select a valid package !!");
		}

	}

}
