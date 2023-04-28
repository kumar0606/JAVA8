package com.basicprograms;

public class SplChar {
public static void main(String[] args) {
	String s="Ravi78++!@#$%&";
	int count =0;
	String splcharremove=" ";
	for (int i = 0; i < s.length(); i++) {
		if(!Character.isAlphabetic(s.charAt(i))&&!Character.isDigit(s.charAt(i))
				&&!Character.isWhitespace(s.charAt(i))) {
		count++;
		splcharremove=splcharremove+s.charAt(i);
	}}
	if(count==0) {
		System.out.println("There is no special character in given string");
	}else {
		System.out.println("String Contains special Character :"+count);
	}
	System.out.println("Special Charactes are :"+splcharremove);
}
}
