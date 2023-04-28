package com.basicprograms;

import java.util.Arrays;
import java.util.List;

public class CountNumbers {
public static void main(String[] args) {
 List<Integer> c=Arrays.asList(0,1,0,1,0,1,0,1,0,1,1);
 int sum=c.stream().reduce(0, (x,y)->x+y);
 System.out.println("number of 1s:"+sum);
 System.out.println("number of 0s:"+(c.size()-sum));
}
}
