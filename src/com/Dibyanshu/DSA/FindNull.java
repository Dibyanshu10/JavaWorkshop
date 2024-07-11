package com.Dibyanshu.DSA;

public class FindNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = new int[] {1,2,3,4,5,7,8,9};
		int size = ar.length+1;
		int totalsum = (size*(size+1))/2;
		int sum = 0;
		for(int num : ar )
		{
			sum=sum + num;
		}
		System.out.println(totalsum-sum);
	}

}
