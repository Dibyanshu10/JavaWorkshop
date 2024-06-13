package com.Dibyanshu.PracticeProjects;

import java.util.Scanner;

public class MadLibsClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to MadLibsClone !!");
		
		System.out.println("Enter an adjective : ");
		String adj1 = sc.next();
		
		System.out.println("Enter the girl's name : ");
		String girl = sc.next();
		
		System.out.println("Enter another adjective : ");
		String adj2 = sc.next();
		
		System.out.println("Enter occupation 1 : ");
		String occ1 = sc.next();
		
		System.out.println("Enter a place : ");
		String place = sc.next();
		
		System.out.println("Enter a clothing : ");
		String cloth = sc.next();
		
		System.out.println("Enter a hobby : ");
		String hobby = sc.next();
		
		System.out.println("Enter another adjective : ");
		String adj3 = sc.next();
		
		System.out.println("Enter another occupation : ");
		String occ2 = sc.next();
		
		System.out.println("Enter the boy's name : ");
		String boy = sc.next();
		
		System.out.println("Enter the man's : ");
		String man = sc.next();
		
		System.out.println("Content :");
		System.out.println("There was a "+adj1+" girl name "+girl+", who was a "+adj2+" "+occ1+" in the kingdom of "+place+". "
				+ "She Loved to wear "+cloth+" and to "+hobby+". She wanted to marry the "+ adj3+ " "+occ2+" named "+ boy+
				" but her father, king "+man+ " forbid her from seeing him.");

	}

}
