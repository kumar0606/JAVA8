package com.dateapis;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class DateDemo {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	System.out.println(today.getDayOfWeek());
	System.out.println(today);
	LocalDate after5days=today.plusDays(10);
	System.out.println(after5days.getDayOfWeek());
	System.out.println(after5days.getMonthValue());
	LocalDate dob=LocalDate.of(1999, 06, 06);
	System.out.println(dob);
	System.out.println(dob.getMonth());
	Period p=Period.between(dob, today);
	System.out.println(p.getYears());
	LocalDate aftrmonth=today.plusMonths(1);
	
	System.out.println(aftrmonth.getMonth());
}
}
