package com.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Demo> d=new ArrayList<Demo>();
	d.add(new Demo(102, "kumar", 4000.00));
	d.add(new Demo(101, "avi", 2000.00));
//	Comparator<Demo> com=new Comparator<Demo>() {
//		
//		@Override
//		public int compare(Demo o1, Demo o2) {
//			
//			return (int) (o1.getSalary()-o2.getSalary());
//		}
//	};
//	Comparator<Demo> com=new Comparator<Demo>() {
//		
//		@Override
//		public int compare(Demo o1, Demo o2) {
//			return (int) (o1.getSalary()-o2.getSalary());
//		}
//	};
	Comparator<Demo> com=new Comparator<Demo>() {
		
		@Override
		public int compare(Demo o1, Demo o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};
Collections.sort(d,com);
for (Demo demo : d) {
	System.out.println(demo);
}
	
	
}
}
