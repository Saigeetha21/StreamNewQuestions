package com.strconcept;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,21,1,34,45);
		Integer num = numbers.stream()
                            .distinct()
                            .sorted((a,b)->b.compareTo(a))
                            .skip(1)
                            .findFirst()
                            .orElse(null);
		if(num != null) {
			System.out.println("The second largest number"+num);
			
		}
		else {
			System.out.println("second largest number is not found");
		}
	}

}
