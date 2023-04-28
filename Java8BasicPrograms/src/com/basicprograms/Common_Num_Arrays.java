package com.basicprograms;

import java.util.HashSet;
import java.util.Set;

public class Common_Num_Arrays {
public static void main(String[] args) {
	int arr1[]= {100,20,30,60,80,90};
	int arr2[]= {100,40,30,60,80,50};
	printIntersection(arr1,arr2);
		
	}
private static void printIntersection(int[] arr1, int[] arr2) {
	Set<Integer> s=new HashSet<>();
	for (int i = 0; i < arr1.length; i++) {
		s.add(arr1[i]);
	}
	for (int i = 0; i < arr2.length; i++) {
		if(s.contains(arr2[i])) {
			//System.out.println(arr2[i]+" ");
		
			System.out.println(arr2[i]);
		
	}
}
}
}