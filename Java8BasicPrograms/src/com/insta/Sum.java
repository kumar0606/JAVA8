package com.insta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum {
public static void main(String[] args) {
	List<Integer> i=Arrays.asList(9,8,7,6,4,3,2,1);
	int sum=i.stream().reduce(0, (a,b)->a+b);

	List<Integer>addsum=	i.stream().map(x->x+sum).collect(Collectors.toList());
System.out.println(addsum);
}
}
