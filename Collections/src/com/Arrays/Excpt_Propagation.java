package com.Arrays;

public class Excpt_Propagation {
	public void method1() {
		int arr[] = { 1, 2, 3 };
		System.out.println(arr[7]);
	}

	public void method2() {
		method1();
		System.out.println("calling method1 in method2");
	}

	public void method3() {
		try {
			method2();
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Excpt_Propagation e = new Excpt_Propagation();
		e.method3();
	}
}
