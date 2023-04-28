package com.dateapis;

import java.time.LocalDate;

public class DateInString {
public static void main(String[] args) {
	String DateInStrings="2023-09-01";
	LocalDate StringtoInt=LocalDate.parse(DateInStrings);
	System.out.println(DateInStrings);
}
}
