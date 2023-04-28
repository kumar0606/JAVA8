package com.mapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,6,7,8,9);
	List<Integer>m= l.stream().map(x->x*5).collect(Collectors.toList());
	System.out.println(m);
}
}
