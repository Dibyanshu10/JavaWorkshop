package com.Dibyanshu.Strings;

public class StringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Dibyanshu Singh");
		
		sb.append(" is awesome !!");
		System.out.println(sb);
		
		sb.insert(10, "Bittu ");
		System.out.println(sb);
		
		sb.replace(25, 35," amazing !! " );
		System.out.println(sb);
		
		sb.delete(10, 16);
		System.out.println(sb);
		
		sb.replace(0, 9, "Dr.");
		System.out.println(sb);

	}

}
