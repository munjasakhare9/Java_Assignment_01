package com.demo.wrapper_classes;

public class Program7 {
	public static void main(String[] args) {
		//Boolean b1 = new Boolean(); //CTЕ
		
		Boolean b2 = new Boolean(true); //true
		Boolean b3 = new Boolean(false); //false
		System.out.println(b2);
		System.out.println(b3);
		//Boolean b4 = new Boolean(True); //CTE
		Boolean b5= new Boolean("TRUE"); //true
		System.out.println(b5);
		
		Boolean b6= new Boolean("false");//false
		Boolean b7 = new Boolean("suresh");//false
		Boolean b8= new Boolean(null); //false
		
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		//Boolean b9= new Boolean(1); //CТЕ
		
		Boolean b9=new Boolean("TrUe");//true
		System.out.println(b9);
		
		Boolean b10=new Boolean("false");//true
		System.out.println(b10);
		
		Boolean b11=new Boolean("True");
		Boolean b12=new Boolean("TrUe");
		System.out.println(b11.equals(b12));//true
		
		String s1=new String("Hello");
		String s2=new String("HeLlO");
		System.out.println(s1.equals(s2));//false
		
		Boolean b13 = Boolean.valueOf("True");
		Boolean b14= Boolean.valueOf("TrUe");

		System.out.println(b13.equals(b14)); // true
	}
}
