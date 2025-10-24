package interviewQues.com;

import java.util.Arrays;
import java.util.List;

public class FourContains {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,4,5,6,3,4);
		long count = numbers.stream().filter(n->String.valueOf(n).contains("4")).count();
		System.out.println(count);
		
		 
	}
	

}
