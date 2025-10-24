package interviewQues.com;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamCount {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		long num = numbers.stream().count();
		System.out.println(num);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
		System.out.println(max);
		OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
		System.out.println(min);
		OptionalDouble avg  = numbers.stream().mapToDouble(Integer::intValue).average();
		System.out.println(avg);
	}

}
