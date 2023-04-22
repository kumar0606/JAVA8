package com.Arrays;

public class ArrayDemo {
public static void main(String[] args) {
	int a[]= {2,5,9,6,3};
	int sum=0;
	int avg=0;
	
	for (int i : a) {
		sum=sum+i;
		avg=sum/a.length;
		System.out.print(i+" ");
		
	}
	System.out.println();
	System.out.println(sum);
	System.out.println(avg);
	
}
}