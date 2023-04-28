package com.flatmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	int sid;
	String sname;
	double sfee;
	public Student(int sid, String sname, double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}
	
	
}
public class FlatMapDemo3 {
public static void main(String[] args) {
	List<Student> l=new ArrayList<Student>();
	l.add(new Student(101, "ravi", 1000.00));
	l.add(new Student(102, "kumar", 5000.00));
	l.add(new Student(105, "satya", 3000.00));
	l.add(new Student(103, "venkat", 4000.00));
	l.add(new Student(103, "asda", 4000.00));
	
//	List<String>m=l.stream().filter(x->x.sfee<3000.00).map(s->s.sname).collect(Collectors.toList());
//	System.out.println(m);
//	List<String> p=l.stream().map(x->x.sname).sorted().collect(Collectors.toList());
//	System.out.println(p);
//	List<Double> p1=l.stream().map(x->x.sfee).sorted(Collections.reverseOrder()).collect(Collectors.toList());
//	System.out.println(p1);
	Student m=l.stream().max((m1,m2)->(int)(m1.sfee-m2.sfee)).get();
	System.out.println(m.sname+" "+m.sfee);
	Map<String, Double> m1=l.stream().collect(Collectors.toMap(Student::getSname, Student::getSfee));
	System.out.println(m1);
	List<Student> c=l.stream().sorted((c1,c2)->(int)(c1.getSfee()-c2.getSfee())).collect(Collectors.toList());
	System.out.println(c);
	Student n=l.stream().sorted((a,b)->(int)(b.getSfee()-a.getSfee())).skip(1).findFirst().get();
	System.out.println(n);
	l.stream().distinct().forEach(h->System.out.println(h));
}
}
