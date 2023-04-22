package com.basicprograms;

import java.util.Optional;

public class Demo {
public static void main(String[] args) {
	String str="ravi";
	Optional<String> opt=Optional.ofNullable(str);
	if(opt.isPresent()) {
	System.out.println("Value is Present "+opt.get());
	}else {
		
		System.out.println("Value is Not Present ");
	}
	
	//add default value
	String str1=null;
	Optional<String> op=Optional.ofNullable(str1);
	if(op.isPresent()) {
	System.out.println("Value is Present "+op.get());
	}else {
		String def=op.orElse("Default Value Add");
		System.out.println("Value is Not Present  "+def);
	}
}
}
