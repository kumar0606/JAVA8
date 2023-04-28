package com.localtime;

import java.time.LocalTime;

public class TimeDemo {
public static void main(String[] args) {
	LocalTime local=LocalTime.now();
	System.out.println(local);
	System.out.println(local.getHour());
	System.out.println(local.getMinute());
	System.out.println(local.getSecond());
	
	// this process is used to find the before and after the time true/false
	LocalTime marktime=LocalTime.of(12, 36);
	System.out.println(marktime);
	LocalTime set=LocalTime.of(9, 36, 15);
	LocalTime set1=LocalTime.of(13, 36, 15);
	System.out.println(set.isBefore(marktime));
	System.out.println(set1.isAfter(marktime));
	
	//process of add sum time to localtime
	LocalTime curnt=LocalTime.now();
	LocalTime add=curnt.plusHours(2);
	System.out.println(add);
	LocalTime sub=curnt.minusHours(1);
	System.out.println(sub);
}
}
