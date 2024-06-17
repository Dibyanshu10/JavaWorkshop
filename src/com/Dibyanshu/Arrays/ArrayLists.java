package com.Dibyanshu.Arrays;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<>();
		
		ar.add("Dibyanshu");
		ar.add("Satya");
		ar.add("Prateek");
// for loop
		
//		for(int i =0; i<ar.size(); i++)
//		{
//			System.out.println(ar.get(i));
//		}

// Enhanced for loop
		for(String name : ar)
		{
			System.out.println(name);
		}
	}

}
