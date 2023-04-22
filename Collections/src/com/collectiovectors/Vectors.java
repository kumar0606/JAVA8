package com.collectiovectors;

import java.util.Vector;

public class Vectors {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	v.add(101);
	v.add(102);
	v.add(106);
	v.add(104);
	v.add(105);
	System.out.println(v);
	v.remove(2);
	System.out.println(v);
	v.set(3, 106);
	System.out.println(v);
	for (Integer i : v) {
		System.out.print(i+" ");
	}
	System.out.println();
	v.remove(2);
	for (int i = 0; i < v.size(); i++) {
		System.out.print(v.get(i)+" ");
	}
}
}
