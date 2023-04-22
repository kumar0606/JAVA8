package com.collectiovectors;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmaps {
public static void main(String[] args) {
	SortedMap<String, Integer> s=new TreeMap<String, Integer>();
	s.put("ravi", 101);
	s.put("kumar", 102);
	System.out.println(s);
	System.out.println(s.tailMap("ravi"));
}
}
