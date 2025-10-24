package interviewQues.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

	/*public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,11,2,3,0);
		List<Integer> number = numbers.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
		System.out.print(number);
	}*/
	// String.valueOf(n)-converting integer to string because string only contains startsWith method.
	//Arrays.asList-> Converting arrays into list.(It is in fixed size we cannot add remove the elements)
	//Stream()-
	  public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,6,3,4);
        List<Integer> num = numbers.stream().filter(n->String.valueOf(n).contains("3")).collect(Collectors.toList());
        System.out.println(num);
        
    }

}
