package com.constructor;

class A {

	private int a;
	private float b;

//	A() {
//		System.out.println("Calling The Constructor");
//	}

	public A setint(int a) {
		//this.a = a;
		A v=new A();
		return v;
	}

	public A setfloat(float b) {
		this.b = b;
		return this;
	}

	void display() {
		System.out.println("Display=" + a + " " + b);
	}
}

// Driver code
public class Example {
	public static void main(String[] args) {
		// This is the "method chaining".
		//new A().setint(10).setfloat(20).display();
		A x=new A();
		x.setint(10).setfloat(12.4f).display();
	}
}