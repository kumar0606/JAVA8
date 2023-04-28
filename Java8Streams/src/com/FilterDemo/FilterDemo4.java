package com.FilterDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employe {
	int eid;
	String ename;
	Double salary;

public Employe(int eid, String ename, Double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}

	@Override
	public String toString() {
		return "FilterDemo [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {
		List<Employe> e=new ArrayList<>();
		e.add(new Employe(101, "ravi", 60000.00));
		e.add(new Employe(102, "kumar", 80000.00));
		e.add(new Employe(103, "satya", 90000.00));
		e.add(new Employe(104, "mani", 70000.00));
		
		e.stream().filter(x->x.salary<=70000.00).forEach(x->System.out.println(x.ename));
		List<Double> m=e.stream().map(x->x.salary).sorted().collect(Collectors.toList());
		System.out.println(m);
	}
}
