package com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
public static void main(String[] args) {
	List<String> teamA=Arrays.asList("ravi","kumar","satya");
	List<String> teamB=Arrays.asList("ravi","kumar","satya");
	List<List<String>> finalteam=Arrays.asList(teamA,teamB);
	
	List<List<String>>m=finalteam.stream().map(x->x).collect(Collectors.toList());
	System.out.println(m);
	finalteam.stream().flatMap(x->x.stream()).forEach(System.out::println);
	finalteam.stream().map(y->y.stream()).forEach(System.out::println);
	finalteam.stream().forEach(x->System.out.println(x));
}
}
