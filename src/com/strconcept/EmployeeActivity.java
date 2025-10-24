package com.strconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Activity{
	String name;
	int hour;
	public Activity(String name, int hour) {
		super();
		this.name = name;
		this.hour = hour;
	}
	public Activity() { 
		super();
	}
	public String getNaxme() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return "Activity [name=" + name + ", hour=" + hour + "]";
	}
	
	
	
}

public class EmployeeActivity {

	public static void main(String[] args) {
		List<Activity> a = new ArrayList<Activity>();
		a.add(new Activity("working",1));
		a.add(new Activity("training",2));
		a.add(new Activity("eating",3));
		a.forEach(b->System.out.println(b));
		
	}

}
