package com.collectiovectors;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashmapDemo {
public static void main(String[] args) {
	IdentityHashMap<Integer, String> m=new IdentityHashMap<>();
	Integer i=new Integer(101);
	Integer i1=new Integer(101);
	m.put(i, "ravi");
	m.put(i1, "kumar");
//	m.put(null, 108);
//	m.put(null, 109);
//	m.put("ravi", 101);
//	m.put("kumar", 102);
//	m.put("ravi", 103);
	//System.out.println(m.hashCode());
	//System.out.println(m.get("kumar").hashCode());
	System.out.println(m);
	
}
}
