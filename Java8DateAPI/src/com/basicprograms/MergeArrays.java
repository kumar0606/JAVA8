package com.basicprograms;

import java.util.Arrays;

public class MergeArrays {
public static void main(String[] args) {
	int a1[]= {1,3,6,4,7,8};
	int a2[]= {2,5,9,7,8,5};
	int l1=a1.length;
	int l2=a2.length;
	int l3=l1+l2;
	int[]a3=new int[l3];
	for(int i=0;i<l1;i=i+1) {
		a3[i]=a1[i];
	}
	for (int i = 0; i < l2; i=i+1) {
		a3[l1 + i]=a2[i];
	}
	for (int i = 0; i <l3; i=i+1) {
		System.out.print(a3[i]+" ");
		Arrays.sort(a3);
		
	}
	
}
}
