package com.methodreferancedemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethod {

	static Integer add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		//USING LAMBDA EXPRESSION
		BiFunction<Integer, Integer, Integer> am=(a,b)->(a+b);
		System.out.println(am.apply(10,20));
		
		//BY USING METHOD REFERENCE
		
		BiFunction<Integer, Integer, Integer> am1=StaticMethod::add;
		
	}
}
