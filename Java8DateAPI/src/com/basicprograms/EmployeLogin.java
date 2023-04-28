package com.basicprograms;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class EmployeLogin {
public static void main(String[] args) {
	LocalTime login=LocalTime.of(8, 15,23);
	LocalTime logout=LocalTime.now();
	Duration duration=Duration.between(login, logout);
	System.out.println(duration.toHours());
	System.out.println(duration.toMinutes()	);
}
}
