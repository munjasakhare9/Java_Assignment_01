package com.demo.person2;

public class Driver {
	void m1(Person p1, Person p2) {
		System.out.println(p1.id+" -- "+p1.name);
		System.out.println(p2.id+" -- "+p2.name);
	}
	
	Person[] m2() {
		Person p1=new Person();
		p1.id=101;
		p1.name="Raju";
		
		Person p2=new Person();
		p2.id=102;
		p2.name="Rani";
		
		Person p3=new Person();
		p3.id=103;
		p3.name="Anil";
		
		Person arr[]= {p1, p2, p3};
		return arr;
	}
	public static void main(String[] args) {
		Driver d=new Driver();
		Person p1=new Person();
		p1.id=101;
		p1.name="Raj";
		
		Person p2=new Person();
		p2.id=102;
		p2.name="Rani";
		
		d.m1(p1, p2);
		
		System.out.println("======================================");
		
		Person arr[]=d.m2();
		for(Person person: arr) {
			System.out.println(person.id+" -- "+person.name);
		}
	}

}
