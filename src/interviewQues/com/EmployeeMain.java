package interviewQues.com;



//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class Employe{
int id;
String name;
String location;

public Employe(int id, String name, String location){
   this.id = id;
   this.name = name;
   this.location =location;
}
@Override
public String toString(){
   return "Employe[id="+id+",name="+name+",location="+location+"]";
}

}

public class EmployeeMain{
public static void main(String[] args) {
   Employe e1 = new Employe (1,"geetha","bangalore");
   Employe e2 = new Employe(2,"teja","hyderabad");
   Employe e3 = new Employe (3,"sahu","bangalore");
   List<Employe> emp = new ArrayList<Employe>();
   emp.add(e1);
   emp.add(e2);
   emp.add(e3);
   emp.stream().forEach(System.out::println);
   emp.stream().filter(b->b.id>1).forEach(System.out::println);
   emp.stream().filter(b->b.location.equalsIgnoreCase("bangalore")).forEach(System.out::println);
   
   
}
}

