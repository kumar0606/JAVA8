package com.methodreferancedemo;

import java.util.function.BiFunction;

public class NonStaticMethod {
public Integer addition(int a, int b) {
	return a+b;
}
public static void main(String[] args) {
	NonStaticMethod nsm=new NonStaticMethod();
	//Using lambda expression
	BiFunction<Integer, Integer, Integer> lambda=(a,b)->(a+b);
	System.out.println(lambda.apply(20, 30));
	
	//Using Method Reference
	BiFunction<Integer, Integer, Integer> method=nsm::addition;
	System.out.println(method.apply(60, 90));
}
}
