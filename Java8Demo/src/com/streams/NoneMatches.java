package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NoneMatches {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("ravi k");
	l.add("kumar m");
	//Stream<String >str=l.stream();
	boolean nonematch=l.stream().noneMatch(x-> {return "kumar m".equals(x);});
	System.out.println(nonematch);
	boolean anymatch=l.stream().anyMatch(x->{return x.contains("i");});
	System.out.println(anymatch);
	boolean allmatch=l.stream().allMatch(x->{return x.contains("j");});
	System.out.println(allmatch);
	boolean allm=l.stream().allMatch(x->{return x.contains("k");});
	System.out.println(allm);
	boolean any=l.stream().anyMatch(y->{return y.contains("i");});
	System.out.println(any);
	boolean non=l.stream().noneMatch(z->{return "satya".equals(z);});
	System.out.println(non);
}
}
