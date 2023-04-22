package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Word {
public static void main(String[] args) {
	String s="ravi kumar ravi kumar kalavala hi ra ravi kumar";
	List<String>l=Arrays.asList(s.split(""));
	Map<Object, Long>n=l.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
	System.out.println(n);
}
}
