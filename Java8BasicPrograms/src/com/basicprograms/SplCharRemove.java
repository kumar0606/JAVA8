package com.basicprograms;

public class SplCharRemove {
public static void main(String[] args) {
	String s="ravi!@#$%&*";
	int count=0;
	String splcharremoved=" ";
	for (int i = 0; i < s.length(); i++) {
		if(!Character.isAlphabetic(s.charAt(i))&&!Character.isDigit(s.charAt(i))
				&&!Character.isWhitespace(s.charAt(i))) {
		count++;
		splcharremoved=splcharremoved+s.charAt(i);
	}}
	if(count==0) {
		System.out.println("ther is no special character ");
	}else {
		System.out.println("special characters are="+count);
	}
	System.out.println(splcharremoved);
}
}
