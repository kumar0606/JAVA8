package com.comparable;

public class Laptop implements Comparable<Laptop>{
String name;
int ram;
Double price;
public Laptop() {
	// TODO Auto-generated constructor stub
}

public Laptop(String name, int ram, Double price) {
	super();
	this.name = name;
	this.ram = ram;
	this.price = price;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
}

@Override
public int compareTo(Laptop o) {
	return this.getName().compareToIgnoreCase(o.getName());
}

}
