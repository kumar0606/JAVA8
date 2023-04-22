package com.imutable;

public class Test {
public static void main(String[] args) {
	Address a=new Address();
	a.setLocation("skl");
	a.setState("ap");
	Student s=new Student(101, "ravi", 2000.00,a);
	
	
	System.out.println(s);
}
}
