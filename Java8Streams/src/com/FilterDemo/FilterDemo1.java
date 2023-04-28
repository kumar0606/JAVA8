package com.FilterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDemo1 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 20, 30, 40, 60, 50, 70, 80, 20, 30, 15, 17, 19);
		l.stream().filter(x->x%2==0).forEach(System.out::println);
		
		List<Integer>m=l.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(m);
		
		Set<Integer>m1=l.stream().filter(n->n%2==0).collect(Collectors.toSet());
		System.out.println(m1);
	}
}
