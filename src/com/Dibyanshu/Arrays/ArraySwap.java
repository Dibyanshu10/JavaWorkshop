package com.Dibyanshu.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3, 4 };
		int[] arr = { 2, 1, 5, 3 };
		sortAr(ar);
		System.out.println();
		sortAr(arr);
		System.out.println();

		boolean result = compareAr(ar, arr);
		if (result == true) {
			System.out.println("Congrats !! The arrays match");
		} else {
			System.out.println("Oops !! The arrays don't match");
		}

	}

	public static void sortAr(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}// end sortAr

	public static boolean compareAr(int ar[], int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ar[i]) {
				return false;
			}
		}
		return true;

	}// end cmpareAr

}
