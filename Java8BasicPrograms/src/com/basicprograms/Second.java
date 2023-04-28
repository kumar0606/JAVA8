package com.basicprograms;

public class Second {
public static void main(String[] args) {
	int a[]= {2,8,7,9,6};
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = i; j < a.length; j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(a[a.length-2]);
}
}
