package com.insta;

public class DebugShells {
	public int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		DebugShells d = new DebugShells();
	int re=	d.add(10, 20);
	System.out.println(re);
	}
}
