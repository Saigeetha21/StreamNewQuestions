package interviewQues.com;

public class StringReverse {

	public static void main(String[] args) {
		String org = "hello";
		StringBuilder rev = new StringBuilder(org).reverse();
		System.out.println(rev);
		
		//another way
		String a ="teja";
		String r ="";
		for(int i=a.length()-1;i>=0;i--) {
			r += a.charAt(i);
			
		}
		System.out.println(r);

		
	}

}
