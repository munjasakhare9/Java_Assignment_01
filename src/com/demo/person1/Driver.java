package com.demo.person1;

public class Driver {
	Person m1(int id) {
		Person p = new Person();
		if (id == 101) {
			p.id = 101;
			p.name = "Raj";
			p.age = 30;
		} else if (id == 102) {
			p.id=102;
			p.name="Rani";
			p.age=32;
		}
		return p;
	}

	public static void main(String args[]) {
		Driver d = new Driver();
		Person p=d.m1(120);
		System.out.println(p.id+" -- "+p.name+" -- "+p.age);
	}

}
