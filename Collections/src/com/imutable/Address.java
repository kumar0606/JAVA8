package com.imutable;

public class Address {
 private String location;
 private String state;
 public Address() {
	// TODO Auto-generated constructor stub
}
 
public Address(String location, String state) {
	super();
	this.location = location;
	this.state = state;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "Address [location=" + location + ", state=" + state + "]";
}
}
