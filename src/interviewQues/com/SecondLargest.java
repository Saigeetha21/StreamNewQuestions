package interviewQues.com;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,5,6,3,9);
		Integer SecondLargest= numbers.stream()
				               .distinct() //remove duplicate elemnets
				               .sorted((a,b)->b.compareTo(a)) //comapring the elements
				               .skip(1)//skip first element
				               .findFirst()//get the second element
				               .orElse(null);//handling the numm valuse
		if(SecondLargest !=null) {
			System.out.println("secondlargestelement"+SecondLargest);
		}
		else {
			System.out.println("No second largest number found");
		}
			
	}

}
