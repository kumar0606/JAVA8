package com.basicprograms;

public class S {
 public static void main(String[] args) {
	int aa[]= {2,3,6,5,4,7,8,9};
	int temp;
	for (int i = 0; i < aa.length; i++) {
		for (int j = i; j < aa.length; j++) {
			if(aa[i]>aa[j]) {
				temp=aa[i];
				aa[i]=aa[j];
				aa[j]=temp;
			}
		}
	}
	System.out.println(aa[aa.length-2]);
}
}
