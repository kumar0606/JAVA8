package com.basicprograms;

import java.time.LocalDate;
import java.time.Period;

public class EmployeJoining {
public static void main(String[] args) {
	LocalDate joiningdate=LocalDate.of(2021, 06, 21);
	LocalDate resigndate=LocalDate.now();
	Period duration=Period.between(joiningdate, resigndate);
	System.out.println(duration.getYears());
	System.out.println(duration.getMonths());
	System.out.println(duration.getDays());
	System.out.println(duration.toTotalMonths());
}
}
