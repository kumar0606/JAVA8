package com.mapdemo;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
public static void main(String[] args) {
	List<String> l=Arrays.asList("ravi","kumar","satya","mani");
	l.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
	l.stream().map(x->x.length()).forEach(x->System.out.println(x));
	l.stream().filter(x->x.startsWith("r")).forEach(x->System.out.println(x));
	
}
}
