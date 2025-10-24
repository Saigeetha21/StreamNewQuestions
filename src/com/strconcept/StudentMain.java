package com.strconcept;

import java.util.ArrayList;

class Student{
	int id;
	String name;
	String loc;
	int sal;
	public Student(int id, String name, String loc, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		
		this.sal = sal;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", loc=" + loc + ", sal=" + sal + "]";
	}
	
	
}
public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1,"geetha","ban",100);
		Student s2 = new Student (2,"teja","hyd",5000);
		Student s3 = new Student(3,"sahu","viz",2000);
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println(s);
		
		s.stream().filter(x->x.sal>200).forEach(System.out::println);
		s.stream().filter(x->(x.getLoc().equalsIgnoreCase("hyd")&x.getSal()<2000)).forEach(System.out::println);
		
		
		
		
	}
}
