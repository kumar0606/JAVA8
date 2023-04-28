package com.basicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {
	public static void main(String[] args) {
		List<Integer> i = Arrays.asList(1, 6, 9, 8, 2, 4);
		int sum = i.stream().reduce(0, (x, y) -> x + y);
		System.out.println("total:" + sum);
		List<Integer> addsum = i.stream().map(x -> x + sum).collect(Collectors.toList());
		System.out.println(addsum);
	}
}
