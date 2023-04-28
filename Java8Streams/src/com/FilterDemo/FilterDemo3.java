package com.FilterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
public static void main(String[] args) {
	List<String> l=Arrays.asList("ravi","kumar","null","satya","null","maheshj");
	List<String> m=l.stream().filter(c->c!=null).collect(Collectors.toList());
	System.out.println(m);
	l.stream().filter(x->x.length()>=4 && x.length()<=5).forEach(System.out::println);
}
}
