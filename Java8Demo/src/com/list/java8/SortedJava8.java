package com.list.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedJava8 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(101);
	list.add(105);
	list.add(109);
	list.add(104);
	list.add(103);
	list.add(104);
	list.add(101);
	//write a program for remove the duplicates
	System.out.println(list.stream().distinct().collect(Collectors.toList()));
	
	// write a program for sort the given list
	System.out.println(list.stream().sorted().collect(Collectors.toList()));
	
	//write a program for reversesort in given list
	System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
	System.out.println(list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
	System.out.println(list.stream().distinct().collect(Collectors.toList()));
}
}
