package Question3;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Main {

	static int x;
	
	public static void main(String[] args) {
			
	List <Student> ls= new ArrayList<>();
	ls.add(new Student(12,"Van",450));
	ls.add(new Student(15,"Ch",480));
	ls.add(new Student(13,"Aati",430));
	ls.add(new Student(10,"Brijesh",410));
	
	List<Employee> emp=ls.stream().map(s->{return new Employee(s.getRoll(),s.getName(),s.getMarks()*1000);}).collect(Collectors.toList());

	for(Employee emp1: emp) {
		System.out.println(emp1);
	}
	}

}
