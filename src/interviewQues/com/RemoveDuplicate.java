package interviewQues.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,23,4,2,4,5);
		List<Integer> num = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(num);

	}

}
