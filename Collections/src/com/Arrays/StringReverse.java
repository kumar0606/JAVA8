package com.Arrays;

public class StringReverse {
public static void main(String[] args) {
	String s="ravi";
	char [] ch=s.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		System.out.println(ch[i]);
	}
	
	//By Using StringBuilder
	StringBuilder sb=new StringBuilder();
	sb.append(s);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
}
}
