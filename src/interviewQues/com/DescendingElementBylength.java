package interviewQues.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DescendingElementBylength {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

		strings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));

		System.out.println(strings);
		
		//retrive longest elemenent
		List<String> string = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

		Optional<String> max =strings.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(max);
		
		

	}

}
