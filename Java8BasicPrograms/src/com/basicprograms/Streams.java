package com.basicprograms;

import java.util.Arrays;
import java.util.List;

public class Streams {
public static void main(String[] args) {
	//Examples of sequenceal streams
	List<Integer> e= Arrays.asList(1,2,3,4,5,6);
	e.stream().forEach(a->{
		System.out.println(a+" "+Thread.currentThread().getName());
	});
	System.out.println("parallel Streams Example");
	//Examples of Parallel Streams	
	List<Integer> p= Arrays.asList(1,2,3,4,5,6);
	p.parallelStream().forEach(a->{
		System.out.println(a+" "+Thread.currentThread().getName());
	});
	
	//Difference Between SequnceStream And ParallelStreams
	//1.SequnceStream maintain the sequence of order
	//1.ParallelStreams does not maintain the sequence of order
	//2.in SequnceStream output is predictable
	//2.in ParallelStreams output is predictable
}
}
