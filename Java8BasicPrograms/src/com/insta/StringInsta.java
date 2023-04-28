package com.insta;

public class StringInsta {
public static void main(String[] args) {
	String s="Hello, ravi";
	if(s.contains("r")) {
		System.out.println("hello ravi");
	}else if(s.indexOf('r')==8) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
}
}
