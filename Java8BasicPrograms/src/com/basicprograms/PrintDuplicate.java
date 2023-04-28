package com.basicprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicate {
	public static void main(String[] args) {
		List<Integer> i = Arrays.asList(100, 10, 20, 30, 10, 20, 40, 50, 40, 40, 40, 10);
		Set<Integer> s = new HashSet<Integer>();
		i.stream().filter(x -> !s.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
//		System.out.println("============");
//		i.stream().limit(5).forEach(x -> System.out.println(x));
//		System.out.println("==========");
//		i.stream().skip(5).forEach(x -> System.out.println(x));
//		List<Integer> m = i.stream().filter(a -> !s.add(a)).collect(Collectors.toList());
//		System.out.println(m);
		Set<Integer> m2 = i.stream().filter(x -> !s.add(x)).collect(Collectors.toSet());
		System.out.println(m2);
//		i.stream().distinct().sorted().forEach(System.out::println);
	//	i.stream().distinct().sorted().forEach(c->System.out.println(c));
	}
}
