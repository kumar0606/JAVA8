package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AllMatch {
public static void main(String[] args) {
	List< String> l=new ArrayList<String>();
	l.add("ravi j");
	l.add("kumar j");
	l.add("kalavla j");
	Stream<String> str=l.stream();
	boolean allmatch=str.allMatch(x->{return x.contains("j");});
	System.out.println(allmatch);
}
}
