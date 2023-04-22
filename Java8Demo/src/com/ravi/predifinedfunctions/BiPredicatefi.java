package com.ravi.predifinedfunctions;

import java.util.function.BiPredicate;

public class BiPredicatefi {
public static void main(String[] args) {
	BiPredicate<Integer, Integer> bip=(a,b)->a<=b;
	System.out.println(bip.test(10, 10));
}
}
