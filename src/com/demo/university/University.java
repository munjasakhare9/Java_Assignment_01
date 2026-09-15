package com.demo.university;

public class University {

	int id;
	String name;

	public static void main(String[] args) {

		University u = m1(101);
		System.out.println(u.id + "--" + u.name);
		String str = u.m2();
		System.out.println(str);

		University u2 = University.m1(102);// we can also access like it, or m1(102)directly
		System.out.println(u2.id + " -- " + u2.name);

		/*
		 * University u2=new University(); University u3=u2.m1(102); //we can access
		 * like this if method is non-satatic System.out.println(u3.id+" -- "+u3.name);
		 */
	}

	String m2() {
		String s = "hello";
		return s;
	}

	static University m1(int id) {
		University u = new University();
		if (id == 101) {
			u.id = 101;
			u.name = "Oxford";
		} else if (id == 102) {
			u.id = 102;
			u.name = "Standford";
		}
		return u;
	}
}
