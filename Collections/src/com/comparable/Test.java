package com.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Laptop> l=new ArrayList<Laptop>();
	l.add(new Laptop("dell", 8, 20000.00));
	l.add(new Laptop("hp", 6, 30000.00));
	l.add(new Laptop("lenovo", 1, 40000.00));
Collections.sort(l);
System.out.println(l);
}
}
