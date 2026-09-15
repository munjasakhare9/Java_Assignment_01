package com.demo.person;

public class Driver {
	Person m1() {
		Person p=new Person();
		p.id=101;
		p.name="rani";
		p.age=32;
		return p;
	}
	
	public static void main(String args[]) {
		Driver d=new Driver();
		Person p=d.m1();
		System.out.println(p.id+" -- "+p.name+" -- "+p.age);
	}
}
