package com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1,2);
	List<Integer> l2=Arrays.asList(3,4);
	List<Integer> l3=Arrays.asList(5,6);
	List<List<Integer>> finallist=Arrays.asList(l1,l2,l3);
	List<Integer> m=finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	System.out.println(m);
}
}
