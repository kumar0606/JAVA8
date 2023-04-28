package com.basicprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingWords {
public static void main(String[] args) {
	String str="hello ravi welcome to java8 and java8 welcome you";
	List<String> ls=Arrays.asList(str.split(" "));
	//Map m=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//Map m=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	Map<String, Long>  m=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//this method is used to counting the words and group the words
	Map<Integer, List<String>> ss=ls.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(m);
	System.out.println(ss);
}
}
