package com.ravi.predifinedfunctions;

import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<String> co=i->System.out.println(i);
	co.accept("ravi");
	Consumer<Integer>b=k->System.out.println(k);
	b.accept(10);
}
}
