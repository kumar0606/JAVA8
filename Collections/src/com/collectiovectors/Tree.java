package com.collectiovectors;

import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
public  static void main(String[] args) {
	TreeMap t=new TreeMap<>();
	t.put("k", 102);
	t.put("m", 101);
	
	t.put("ravi", 103);
	System.out.println(t);
	Object s=t.get("k");
	System.out.println(s);
}
}
