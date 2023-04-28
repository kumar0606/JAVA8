package com.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Laptop> l = new ArrayList<Laptop>();
		l.add(new Laptop("dell", 8, 20000.00));
		l.add(new Laptop("hp", 6, 30000.00));
		l.add(new Laptop("lenovo", 1, 40000.00));
		Collections.sort(l);
		System.out.println(l);
		for (Laptop laptop : l) {
			System.out.println(laptop.getRam());

		}
		for (Laptop laptop : l) {
			System.out.println(laptop.getPrice());
		}
		String s = "ravi";
		String s1 = "ravi";
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		String a=new String("A");
		String a1=new String("A");
		StringBuffer sb = new StringBuffer("ravi");
		StringBuffer sb1 = new StringBuffer("ravi");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
		
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		
		IdentityHashMap<Integer, String> i=new IdentityHashMap<>();
		Integer n=new Integer(10);
		Integer m=new Integer(10);
		i.put(n, "ravi");
		i.put(m, "ravi");
		System.out.println(i);
	}
}
