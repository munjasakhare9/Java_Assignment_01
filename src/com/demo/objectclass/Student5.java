package com.demo.objectclass;

public class Student5 {

	public static void main(String[] args) throws Exception {

		Student5 s = new Student5(); // obj creation
		Class clz = s.getClass();
		System.out.println(clz.getName());
		System.out.println(s.getClass().getName()); // method chaining to get cls name

		Object object = clz.newInstance(); // 2nd approach to create object for a cls
		System.out.println(object);

		System.out.println(s.getClass().newInstance());

		//extra
		System.out.println(s == (Student5) object);

	}
}