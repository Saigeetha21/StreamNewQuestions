package com.strconcept;
import java.util.ArrayList;
import java.util.List;

class Employee{
    public int id;
    public String Name;
    public String Location;
    
    public Employee(int id,String Name,String Location){
        this.id = id;
        this.Name = Name;
        this.Location = Location;
    }

    
  
    
    public Employee() {
		super();
	}



	public int getId(){
        return id;
    }
     public void setId(int id){
         this.id = id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        Name = Name;
    }
    public String getLocation(){
        return Location;
    }
    public void setLocation(String Location){
        Location = Location;
    }



	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Location=" + Location + "]";
	}
    
}


public class EmployeeMain{
    public static void main(String[] args){
        Employee e1 = new Employee(1,"geetha","hyd");
        Employee e2 = new Employee(2,"sai","Ban");
        Employee e3 = new Employee(4,"ramya","hyd");
        Employee e4 = new Employee(3,"teja","Ban");
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.stream().filter(x->x.getLocation().equalsIgnoreCase("hyd")).forEach(System.out::println);
        emp.stream().sorted((a,b)->Double.compare(b.getId(),a.getId())).forEach(System.out::println);
        
       
    }
    
}