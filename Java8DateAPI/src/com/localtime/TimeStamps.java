package com.localtime;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TimeStamps {
public static void main(String[] args) {
	LocalDateTime time=LocalDateTime.now();
	System.out.println(time);
	Timestamp stamp=Timestamp.valueOf(time);
	System.out.println(stamp);
	
	//convert timestamp to localdatetime
	LocalDateTime tolocal=stamp.toLocalDateTime();
	
}
}
