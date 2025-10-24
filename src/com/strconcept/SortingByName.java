package com.strconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students{
	

	int id;
	String name;
	int age;
	
	public Students(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
	
	class NameComparator implements Comparator<Students>{
		public int compare (Students s1, Students s2) {
			return s1.name.compareTo(s2.name);
		}
		
	}
	
	

public class SortingByName {

	

	public static void main(String[] args) {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(1,"geetha",10));
		al.add(new Students(2,"teja",20));
		al.add(new Students(3,"sahasra",21));
		Collections.sort(al, new NameComparator());
		for(Students s:al)
		System.out.println(s.id+" "+s.name+" "+s.age);
		

	}
}

