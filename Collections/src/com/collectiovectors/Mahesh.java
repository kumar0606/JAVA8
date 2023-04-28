package com.collectiovectors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mahesh {
	int id;
	String name;
	
public Mahesh(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Mahesh [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	List<Mahesh> m=new ArrayList<Mahesh>();
	m.add(new Mahesh(1, "ravi"));
	m.add(new Mahesh(2, "kumar"));
	Iterator<Mahesh> itr=m.iterator();
	Iterator<Mahesh> itr1=m.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next().getId());
//		System.out.println(itr.next().getName());
		System.out.println(itr.next());
	}
	while(itr1.hasNext()) {
		System.out.println(itr1.next().getName());
	}
	for (Mahesh mahesh : m) {
		System.out.println(mahesh.getId());
		
	}
	for (Mahesh mahesh : m) {
		System.out.println(mahesh.getName());
	}
}
}
