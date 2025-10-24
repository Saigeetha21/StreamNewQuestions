package com.strconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Booking {
	int id;
	String busname;
	String location;
	int price;

	public Booking(int id, String busname, String location, int price) {
		super();
		this.id = id;
		this.busname = busname;
		this.location = location;
		this.price = price;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBusname() {
		return busname;
	}


	public void setBusname(String busname) {
		this.busname = busname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		
		
		this.location = location;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", busname=" + busname + ", location=" + location + ", price=" + price + "]";
	}
public static void main(String[] args) {
	
	Booking b1 = new Booking(1,"geetha","bang",100);
	Booking b2 = new Booking(2,"sis","hyd",160);
	
	List<Booking> book = new ArrayList<>();
	book.add(b1);
	book.add(b2);
	book.stream().filter(x->x.price>150).forEach(System.out::println);
	
	
	//if you want to print the employee based on bangulore(location)
	book.stream().filter(x->x.getLocation().equalsIgnoreCase("hyd")).forEach(System.out::println);
	
	//If you want to print the employee based on location and price
	book.stream().filter(x->x.getPrice()>150 && x.getLocation().equalsIgnoreCase("hyd")).forEach(System.out::println);
	
	
	
	
	
		
		
	}

}
