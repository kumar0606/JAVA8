package com.optionalclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerTest {
public static void main(String[] args) {
	Customer cust=new Customer(101, null, "ravi@gmail.com", "78963741753");
//	List<Customer> cust=new ArrayList<Customer>();
//	cust.add(new Customer(101, null, "ravi@gmail.com", "321456987"));
//	cust.add(new Customer(102, "satya", "satya@gmail.com", "9846789654"));
//	cust.add(new Customer(103, "mani", "mani@gmail.com", "3214565487"));
//	cust.add(new Customer(104, "venkat", "venkat@gmail.com", "369852147"));
	

	Optional<String> str=Optional.ofNullable(cust.getName());
	if(str.isPresent()) {
	System.out.println(str.get());
	}else {
		System.out.println("null is handled");
	}
	
}
}
