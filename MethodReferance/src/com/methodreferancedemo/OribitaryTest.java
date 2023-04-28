package com.methodreferancedemo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OribitaryTest {
public static void main(String[] args) {
	Oribitary oribitary=new Oribitary();
	//By Using Lambda Expression
	BiFunction<Oribitary, String, String> or=(a,b)->a.tolower(b);
	System.out.println(or.apply(oribitary, "RAVI"));
	
	//By Using Method Reference
	BiFunction<Oribitary, String, String> m=Oribitary::toupper;
	System.out.println(m.apply(oribitary, "ravi"));
}
}
