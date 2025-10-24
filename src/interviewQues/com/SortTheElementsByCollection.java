package interviewQues.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortTheElementsByCollection {

	public static void main(String[] args) {
		ArrayList<String> hm = new ArrayList<String>();
		hm.add("geetha");
		hm.add("teja");
		hm.add("sahasra");
		Collections.sort(hm);
		System.out.println(hm);
		//reverse the elements
		Collections.sort(hm,Collections.reverseOrder());

		//reverse the elements by length
		 Collections.sort(hm, Comparator.comparingInt(String::length).reversed());
		Iterator<String> itr = hm.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
