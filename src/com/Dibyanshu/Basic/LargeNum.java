package com.Dibyanshu.Basic;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {5,4,3,2,1};
		int [] newAr=new int[ar.length-1];
		int count =0;
		
		for(int i = 0; i<ar.length-1; i++) {
			if(ar[i]>ar[i+1])
			{
				newAr[count]=ar[i];
				count++;
			}
		}
		for(int j =0; j<newAr.length; j++)
		{
			System.out.println(newAr[j]);
		}

	}

}
