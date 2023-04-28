package com.basicprograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapDemo {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	map.put("ravi", 3);
	map.put("kumar", 2);
	map.put("satya", 1);
	System.out.println(map);
	List<Entry<String, Integer>> n=map.entrySet().stream().sorted((e1,e2)->e1.getValue()-e2.getValue()).collect(Collectors.toList());
	System.out.println(n);
}
}
