package com.predicatedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateArray {
public static void main(String[] args) {
	String names[]= {"ravi","sumar","staya","raja"};
//	Predicate<String> n=name->name.charAt(0)=='s';
//	for (String name1 : names) {
//		if(n.test(name1))
//		System.out.println(name1);
//	}
	List<String>l=Arrays.asList(names);
	l.stream().filter(x->x.charAt(2)=='v').forEach(System.out::println);
	
}
}
