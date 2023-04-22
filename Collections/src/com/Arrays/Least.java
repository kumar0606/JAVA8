package com.Arrays;

public class Least {
public static void main(String[] args) {
	int [] arr= {10,20,60,1,0,6,8,9,77,5};
	int least=arr[3];
	int heigst=arr[3];
	for (int i = 1; i < arr.length; i++) {
		if(least>arr[i]) {
		least=arr[i];
		}
		if(heigst<arr[i]) {
		heigst=arr[i];
		}
	}
	System.out.println(least);
	System.out.println(heigst);
	
}
}
