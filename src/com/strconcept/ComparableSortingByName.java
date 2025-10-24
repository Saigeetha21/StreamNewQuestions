package com.strconcept;

import java.util.ArrayList;

import java.util.Collections;

class Person implements Comparable<Person>{
	int id;
	String name;
	int age;
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}
	
}
public class ComparableSortingByName {

	public static void main(String[] args) {
		ArrayList<Person> a = new ArrayList<Person>();
		a.add(new Person(1,"geetha",12));
		a.add(new Person(2,"teja",15));
		a.add(new Person(3,"sahasra",10));
		Collections.sort(a);
		for(Person p :a) {
			System.out.println(p.id+" "+p.name+" "+p.age);
		}
		
	}

}
