package com.demo.constructor;

public class MainClass2 {
	public static void main(String args[]) {
		EligServiceImpl    eligService = new EligServiceImpl ( );
		EligResponse response = eligService.executePlanCondtions (101l, "Vodafone", 20);
		System.out.println(response);
	}
}
