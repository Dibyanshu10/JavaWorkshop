package com.Dibyanshu.Stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10, 12, 4, 5, 28, 77, 11, 23, 76);
		list.stream().filter(n -> n%2==0).forEach(System.out::println);

	}

}
