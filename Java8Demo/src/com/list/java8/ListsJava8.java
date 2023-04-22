package com.list.java8;

import java.util.ArrayList;
import java.util.List;

public class ListsJava8 {
public static void main(String[] args) {
	List list1=new ArrayList<>();
	list1.add("ravi1");
	list1.add("ravi2");
	list1.add("ravi3");
	
	List list2=new ArrayList<>();
	list1.add("kumar1");
	list1.add("kumar2");
	list1.add("kumar3");
	
	List list3=new ArrayList<>();
	list3.addAll(list1);
	list3.addAll(list2);
	System.out.println(list3);
	
	}}
