package com.strconcept;

import java.util.ArrayList;
import java.util.Collections;

class Animal implements Comparable<Animal>{
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public int compareTo(Animal other) {
		return Integer.compare(this.age,other.age);
	}
	
}

public class ComparableSortingByAge {

	public static void main(String[] args) {
		ArrayList<Animal> a = new ArrayList<Animal>();
		a.add(new Animal("dog",5));
		a.add(new Animal("cat",4));
		a.add(new Animal("cow",10));
		Collections.sort(a);
		for(Animal e :a) {
			System.out.println(e.name+" "+e.age);
		}
		
		
		
	}

}
