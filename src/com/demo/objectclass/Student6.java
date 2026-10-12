package com.demo.objectclass;

public class Student6 implements Cloneable {

	public static void main(String[] args) throws Exception {

		Student6 s = new Student6();
		System.out.println(s);

		Object clone = s.clone(); // cloning (another approch to create obj for a class)
		System.out.println(clone);
		
		
		//extra
		Student6 s2=s;
		System.out.println(s==s2);
	}
}
