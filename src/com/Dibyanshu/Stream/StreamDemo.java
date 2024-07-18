package com.Dibyanshu.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = Arrays.asList(11,2,43,4,52,3,5,78,99);
		Predicate<Integer> predi = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer n) {
				// TODO Auto-generated method stub
				if(n%2==1)
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
		};
		num.stream()
		            .filter(predi)
		            .sorted()
		            .map(n ->  n*10)
		            .forEach(n -> System.out.println(n));
	}
}