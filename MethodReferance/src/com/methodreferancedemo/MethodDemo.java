package com.methodreferancedemo;

import java.awt.print.Printable;
import java.util.function.Function;
@FunctionalInterface
interface printable{
	void print(String msg);
}

public class MethodDemo {
	public void display(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
public static void main(String[] args) {
	MethodDemo st=new MethodDemo();
//using lambda expression
	printable p=msg->st.display(msg);
	p.print("wefy9wefgwefw");
	//using method referance
	printable pm=st::display;
	pm.print("wqdehtjg");
}
}