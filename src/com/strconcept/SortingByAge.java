package com.strconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employe{
	int id;
	String name;
	int age;
	
	public Employe(int id,String name ,int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
class AgeComparator implements Comparator<Employe>{
	public int compare(Employe e1, Employe e2) {
		return Integer.compare(e1.age, e2.age);
	}
}
public class SortingByAge {

	public static void main(String[] args) {
		ArrayList<Employe> el = new ArrayList<Employe>();
		el.add(new Employe(1,"geetha",19));
		el.add(new Employe(2,"teja",20));
		el.add(new Employe(3,"sahu",12));
		Collections.sort(el,new AgeComparator());
		for(Employe e:el) {
			System.out.println(e.id+" "+e.name+" "+e.age);
		}
		
		

	}

}
