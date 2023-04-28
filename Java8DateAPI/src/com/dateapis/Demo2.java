package com.dateapis;

import java.time.LocalDate;

public class Demo2 {
public static void main(String[] args) {
	LocalDate l=LocalDate.now();
	System.out.println(l);
	LocalDate pl=l.plusDays(10);
	System.out.println(pl.getMonth());
	System.out.println(l.getDayOfWeek());
	LocalDate min=l.minusDays(5);
	System.out.println(min.getDayOfWeek());
	LocalDate mul=l.plusWeeks(5);
	System.out.println(mul.getMonth());
	int len=mul.lengthOfMonth();
	System.out.println(len);
	System.out.println(l.lengthOfMonth());
	System.out.println(l.isLeapYear());
	System.out.println(l.lengthOfYear());
}
}