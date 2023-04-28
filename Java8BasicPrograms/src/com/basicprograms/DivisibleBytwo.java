package com.basicprograms;

import java.util.Arrays;
import java.util.List;

public class DivisibleBytwo {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2, 5, 6, 8);

		boolean divide = l.stream().allMatch(x -> x % 2 == 0);
		if (divide) {
			System.out.println("all numbers divided by 2");
		} else {
			System.out.println("all the numbers not divided by 2");
		}
	}
}
