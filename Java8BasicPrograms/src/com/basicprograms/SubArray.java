package com.basicprograms;

public class SubArray {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	int result=0;
	int sum=0;
	int k=5;
	for (int i = 0; i < arr.length-1; i++) {
		sum=sum+arr[i];
		result++;
//		if(sum==k) {
//			 //break;
//			
//		}
	}
	System.out.println("The Number of subarray sums "+k+" is "+result);
}
}
