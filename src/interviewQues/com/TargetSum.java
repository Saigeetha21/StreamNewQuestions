package interviewQues.com;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TargetSum {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,4,7,9);
		int target =5;
		
		Optional<int[]> res = num.stream().flatMap(a->num.stream()
				.filter(b->a+b == target&&!a.equals(b))
				.map(b-> new int[] {a,b})).findFirst();
		res.ifPresent(pair -> System.out.println(pair[0]+","+pair[1]));

	}

}
