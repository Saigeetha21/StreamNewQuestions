package interviewQues.com;

import java.util.Arrays;
import java.util.List;

public class GreaterThan4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,24,3,45,7);
		numbers.stream().filter(n->n>4).forEach(System.out::println);

	}

}
