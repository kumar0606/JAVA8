package com.insta;

public class Insta {
public static void main(String[] args) {
	int x=5 ;
	int y=10;
	int z=x>y?x+y:x-y;
	if(z>0) {
		System.out.println("Positive Number");
	}else if(z<0) {
		System.out.println("Negative Number");
	}else {
		System.out.println("Zero");
	}
}
}
