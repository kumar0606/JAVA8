package com.dateapis;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class LocalDateTimes {
public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	OffsetDateTime o= OffsetDateTime.now();
	System.out.println(o);
}
}
