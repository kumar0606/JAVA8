package com.insta;

public class DebugDemo {
	public int add(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		DebugDemo d=new DebugDemo();
		int re=d.add(10, 20);
		System.out.println(re);
	}
}
