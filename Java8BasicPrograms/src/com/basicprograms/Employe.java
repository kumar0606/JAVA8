package com.basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Employe {
	int eid;
	String ename;
	double esal;
	int age;

	public Employe() {
	}

	public Employe(int eid, String ename, double esal, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (age != other.age)
			return false;
		return true;
	}

	public static void main(String[] args) {
		List<Employe> emp = new ArrayList<Employe>();
		emp.add(new Employe(101, "ravis", 20000.00, 23));
		emp.add(new Employe(102, "satya", 30000.00, 25));
		emp.add(new Employe(103, "kumar", 40000.00, 24));
		emp.add(new Employe(104, "mahesh", 50000.00, 21));
		emp.add(new Employe(105, "prasad", 60000.00, 26));
		emp.add(new Employe(106, "kumar", 40000.00, 24));
//		Map<Integer, Set<Employe>> nm = emp.stream()
//				.collect(Collectors.groupingBy(x -> x.getAge(), Collectors.toSet()));
//		System.out.println(nm);
//		Map<Integer, List<Employe>> m = emp.stream().collect(Collectors.groupingBy(x -> x.getAge()));
//		System.out.println(m);
//	Map<Object, List<Employe>>n=emp.stream().collect(Collectors.groupingBy(x->x.getEname()));
//	System.out.println(n);
//	List<Employe>l=emp.stream().sorted((m1,m2)->m1.getAge()-m2.getAge()).skip(5).collect(Collectors.toList());
//	System.out.println(l);
//	Map<Object, List<Employe>>k=emp.stream().collect(Collectors.groupingBy(x->x.getAge()));
//	System.out.println(k);
//	emp.stream().filter(x->x.getEsal()>=20000&&x.getEsal()<40000).forEach(System.out::println);
//		Employe n = emp.stream().findAny().get();
//		System.out.println(n);
//		Employe n1 = emp.stream().findAny().get();
//		System.out.println(n1);

		List<Employe> c = emp.stream().map(e -> {
			if (e.getAge() >= 25) {
				e.setEsal(e.getEsal()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(c);

	}
}
