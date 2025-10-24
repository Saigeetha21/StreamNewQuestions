package interviewQues.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescending {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,5,6,3);
		List<Integer> num = numbers.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println(num);
		//Descending
		List<Integer> num1 = numbers.stream().sorted((n1,n2)->n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println(num1);
		
		 
	}

}
