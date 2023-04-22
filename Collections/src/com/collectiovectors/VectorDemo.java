package com.collectiovectors;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("ravi");
	v.add("kumar");
	v.add(0,"kalavala");
	v.remove(0);
	v.add(0, "kalavala");
	System.out.println(v);
	for (int i = 0; i < v.size(); i++) {
		System.out.print(v.get(i)+" ");
	}
	System.out.println();
	for (Object object : v) {
		System.out.print(object+" ");
	}
}
}
