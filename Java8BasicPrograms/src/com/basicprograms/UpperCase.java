package com.basicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UpperCase {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("ravi", "kumar", "kalavala");
		String str = s.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(str);
		List<Integer> g = Arrays.asList(1, 2, 3, 4, 5,4);
		int sum = g.stream().reduce(0, (c, n) -> c + n);
		List<Integer> b = g.stream().map(c -> c + sum).collect(Collectors.toList());
		System.out.println(b);
      Map<Object, Long> v=g.stream().map(x->x+sum).collect(Collectors.groupingBy(x->x,Collectors.counting()));
      System.out.println(v);
	}
}
