package com.Arrays;

import java.util.Arrays;

public class ArrayDemo2 {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=1;
	a[1]=1;
	//generate default value
	a[3]=1;
	a[4]=1;
	//a[5]=1;
	
	//print by using tostring
	System.out.println(Arrays.toString(a));
	
	// print by using forloop
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
	System.out.println();
	//print by using foreach
	for (int i : a) {
		System.out.println(i);
	}
	
}
}
