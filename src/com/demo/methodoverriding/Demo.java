package com.demo.methodoverriding;

public class Demo {

	public static void main(String[] args) {

		SBIBank b1 = new SBIBank();
		SBIBank b2 = new SBIBank();

		boolean bankObjStatus = b1.equals(b2); // false
		System.out.println("Both Banks Are Equal ?? :: " + bankObjStatus);

		String s1 = new String("ashokit");
		String s2 = new String("ashokit");

		boolean stringObjStatus = s1.equals(s2); // true
		System.out.println("Both Strings Are Equal ?? :: " + stringObjStatus);

	}
}
