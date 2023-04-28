package com.methodreferancedemo;

public class ConstructorMethod {
String ename;
int eid;
public ConstructorMethod() {
	// TODO Auto-generated constructor stub
}
public ConstructorMethod(String ename, int eid) {
	super();
	this.ename = ename;
	this.eid = eid;
}
@Override
public String toString() {
	return "ConstructorMethod [ename=" + ename + ", eid=" + eid + "]";
}
public void getinfo() {
	System.out.println("iam from  normal class");
}


}
