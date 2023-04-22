package com.imutable;

public class Student {
	private int id;
	private String name;
	private double fee;
    private Address add;
	public Student() {
		
	}
	public Student(int id, String name, double fee, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getFee() {
		return fee;
	}
	public Address getAdd() {
		return new Address(add.getLocation(),add.getState());
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", add=" + add + "]";
	}

	

}
