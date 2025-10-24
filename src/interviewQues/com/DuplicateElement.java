package interviewQues.com;

import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
//Find the duplicate elements
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,2,9);
		Set<Integer>num = new HashSet();
		List<Integer>n1 = numbers.stream().filter(n->!num.add(n)).collect(Collectors.toList());
		System.out.println(n1);
		
		
		//using string
		List<Character> lis = Arrays.asList('g','e','e','t','h','a');
	       Set<Character> n2 = new HashSet();
	       List<Character> res = lis.stream().filter(n->!n2.add(n)).collect(Collectors.toList());
	       System.out.println(res);

	}

}
