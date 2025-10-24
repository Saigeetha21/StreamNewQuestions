package com.strconcept;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumberusinglamda {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,553,33,55,6,2,6,7);
		//list.stream(create a stream from the list)
		//mapToInt(convert Stream Integer to int Stream)
		int sum = numbers.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}

}
