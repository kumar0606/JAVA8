package com.dateapis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employe {
	int id;
	String name;
	int age;
	String department;
	public Employe(int id, String name, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	public static void main(String[] args) {
		List<Employe> e=new ArrayList<Employe>();
		e.add(new Employe(101, "ravi", 23, "hr"));
		e.add(new Employe(102, "kumar", 25, "it"));
		e.add(new Employe(101, "mahi", 24, "hr"));
		e.add(new Employe(101, "yv", 35, "it"));
	Map<Object, Double>n=e.stream().collect(Collectors.groupingBy(Employe::getDepartment,Collectors.averagingDouble(x->x.getAge())));
	System.out.println(n);
	}
}
