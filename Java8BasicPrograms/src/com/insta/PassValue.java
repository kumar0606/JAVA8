package com.insta;

public class PassValue {
	void m1(int i) {
		i = i + 10;
		//System.out.println(i);
	}

	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		PassValue p = new PassValue();
		p.m1(i);
		System.out.println(i);
		
	}
}
