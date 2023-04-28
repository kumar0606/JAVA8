package com.basicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);
		
		List<String> n=Arrays.asList("aa","ss","dd","aa","dd");
	Map<String, Long>m=	n.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));
	System.out.println(m);
	}
}
