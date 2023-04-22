package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Employe {
	int id;
	String name;
	double salary;

	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employe> e = new ArrayList<Employe>();
		e.add(new Employe(101, "ravi", 30000.10));
		e.add(new Employe(102, "kumar", 40000.20));
		e.add(new Employe(103, "satya", 60000.20));
		e.add(new Employe(104, "mahseh", 20000.20));
		e.add(new Employe(105, "prasad", 10000.20));
//		System.out.println(e);
//		Iterator<Employe> i = e.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
//		System.out.println(e.toString());

		e.stream().filter(st -> st.salary < 60000.00).forEach(st -> System.out.println(st.getName()));

		// write a program for who name starts with r
		e.stream().filter(y -> y.getName().startsWith("r")).forEach(ee -> System.out.println(ee.getName()));

		// write a program for print the employees names
		List<String> n = e.stream().map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(n);

		// write a program for print the employees id's
		List<Integer> id = e.stream().map(i -> i.getId()).collect(Collectors.toList());
		System.out.println(id);

		// write a program for print minimum salary of Employees
	Employe min = e.stream().min((m1,m2)->(int)(m1.getSalary()-m2.getSalary())).get();
	System.out.println("Employe name"+min.getName()+"salary"+min.getSalary());
	
		// write a program for print maximum salary of employees
	Employe max=e.stream().max((s1,s2)->(int)(s1.getSalary()-s2.getSalary())).get();
	System.out.println("Employe name "+max.getName()+" and salary "+max.getSalary());

		// write a program for sort based on salary
//		List<Double> s = e.stream().map(m -> m.getSalary()).sorted().collect(Collectors.toList());
//		System.out.println(s);
//		List<Integer> c=e.stream().map(i ->i.getId()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(c);
//		List<Double> k=e.stream().map(y->y.getSalary()).sorted().collect(Collectors.toList());
//		System.out.println(k);
//		
//		//Find 3rd heighest salaries
	List<Employe>m=e.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList());
	System.out.println(m);
//	
//	//Find least salaries
//	List<Employe>m1=e.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).limit(3).collect(Collectors.toList());
//	System.out.println(m1);
//	e.stream().skip(1).limit(2).forEach(x->System.out.println(x));
//	e.stream().forEach(v->System.out.println(v));
//	Double b=e.stream().collect(Collectors.averagingDouble(x->x.getSalary()));
//	System.out.println(b);
//	DoubleSummaryStatistics b1=e.stream().collect(Collectors.summarizingDouble(x->x.getSalary()));
//	System.out.println(b1);
//	double b2=e.stream().mapToDouble(x->x.getSalary()).average().getAsDouble();
//	System.out.println(b2);
//	
	Employe nn=e.stream().min((m1,m2)->(int)(m2.getSalary()-m1.getSalary())).get();
	System.out.println(nn);
	List<Employe>b=e.stream().sorted((c1,c2)->(int)(c1.getSalary()-c2.getSalary())).limit(3).collect(Collectors.toList());
	System.out.println(b);
	}
}
