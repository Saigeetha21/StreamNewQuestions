package interviewQues.com;

public class MissingNumber {

	public static void main(String[] args) {
		
		// for natural numbers.
		int a =6;
		int[] b = {1,2,3,5,6};
		int s =a*(a+1)/2;
		int e=0;
		for(int i =0;i<b.length;i++ ) {
			e= e+b[i];
			
		}
		System.out.println(s-e);
		
		//for odd sequence
		int c = 6;
		int [] d = {1,3,5,9,11};
		int g = c*c;
		int h =0;
		for (int i =0;i<d.length;i++) {
			h=h+d[i];
		}
		System.out.println(g-h);	
		
		//for even sequence
		int k =6;
		int[] n = {2,4,6,10,12};
		int t = k*(k+1);
		int p = 0;
		for(int i =0;i<n.length;i++) {
			p=p+n[i];
		}
		System.out.println(t-p);

	}

}
