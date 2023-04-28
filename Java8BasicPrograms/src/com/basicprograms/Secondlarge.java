package com.basicprograms;

public class Secondlarge {
public static void main(String[] args) {
	int a[]= {1,21,3,22,5,25,27,8};
	int temp;
    int size=a.length;
	for (int i = 0; i < a.length; i++) {
		for (int j = i; j < a.length; j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(a[size-2]);
}
}
