package com.ravi.predifinedfunctions;

import java.util.function.BiFunction;

public class BiFunctions {
public static void main(String[] args) {
	BiFunction<String, String, String> bif=(a,b)->a+b;
	System.out.println(bif.apply("ravi","kumar"));
}
}
