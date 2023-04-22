package com.predicatedemo;

import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<Integer> p=f->f>10;
	System.out.println(p.test(5));
	System.out.println(p.test(11));
}
}
