package interviewQues.com;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TargetSum {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,4,7,9);
		int target =5;
		
		Optional<int[]> res = num.stream().flatMap(a->num.stream()
				.filter(b->a+b == target&&!a.equals(b))
				.map(b-> new int[] {a,b})).findFirst();
		res.ifPresent(pair -> System.out.println(pair[0]+","+pair[1]));
		
		
		
		
		
		String str = "geetha";
		//str.char()- convert string into ascii values
		//mapToOjt - convert int into character
		//first and last index of the letter is same(it means not repeated).
		List<Character> resu = str.chars().mapToObj(c->(char)c).
	                    filter(c->str.indexOf(c) == str.lastIndexOf(c)).
	                    collect(Collectors.toList());
		System.out.println(resu);
		
		List<Integer> nums = Arrays.asList(1,3,2,3,2,4,5,6,1);
        List<Integer> res1 = nums.stream().filter(n->nums.indexOf(n)==nums.lastIndexOf(n)).collect(Collectors.toList());
        System.out.println(res1);
	}

}
