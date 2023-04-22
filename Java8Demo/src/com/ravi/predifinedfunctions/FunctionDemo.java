package com.ravi.predifinedfunctions;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function<String, Integer> f=i->i.indexOf('I');
	System.out.println(f.apply("RAVIKUMAr"));
	
	Function<String, Character> i=x->x.charAt(0);
		System.out.println(i.apply("ravi"));
	
		Function<Integer, Boolean> b=n->n>10;
		System.out.println(b.apply(11));
}

}
