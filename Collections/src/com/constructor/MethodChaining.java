package com.constructor;

public class MethodChaining {
	
	
public MethodChaining() {
		super();
		// TODO Auto-generated constructor stub
	}
public int m1(int a) {
	System.out.println("method1");
	return a;
}
public void m2() {
	this.m2();
	System.out.println("method2");
}
public void m3() {
	this.m2();
	System.out.println("method3");
}
public static void main(String[] args) {
	MethodChaining me=new MethodChaining();
	me.m3();
	
}
}
