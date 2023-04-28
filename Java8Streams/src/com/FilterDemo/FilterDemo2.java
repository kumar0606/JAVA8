package com.FilterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
public static void main(String[] args) {
	List<String> l=Arrays.asList("ravis","kumar","satya","pawan","sai");
	l.stream().filter(s->s.length()>3 && s.length()<=5).forEach(n->System.out.println(n));
List<String> m=l.stream().filter(c->c.length()>2&&c.length()<6).collect(Collectors.toList());
System.out.println(m);
}
}
