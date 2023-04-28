package com.basicprograms;

import java.util.StringJoiner;

public class StringJoiners {
	public static void main(String[] args) {
		StringJoiner str = new StringJoiner(",", "{", "}");
		str.add("ravi").add("kumar").add("kalavala");
		System.out.println(str);
		StringJoiner sj = new StringJoiner(":", "{", "}");
		sj.add("ss");
		sj.add("dd");
		System.out.println(sj);
	}
}
