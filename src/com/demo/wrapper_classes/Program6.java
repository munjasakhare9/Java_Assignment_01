package com.demo.wrapper_classes;

public class Program6 {
	public static void main(String[] args) {
		Double d1 = new Double(80.8);
		Double d2 = new Double("80.8");
		System.out.println(d1);//80.8
		System.out.println(d2);//80.8
		System.out.println(d1==d2);//false
		System.out.println(d1.equals(d2));//true
		
		Integer m=40;
		Integer n=40;
		System.out.println(m==n);//true
		
		Double m1=40.0;
		Double n1=40.0;
		System.out.println(m1==n1);
		
		Float num1 = 10.5f;
		Float num2 = 10.5f;
		System.out.println(num1 == num2);// false
		
		Double x=new Double(10.10);
		Double y=new Double(10.10f);
		Double z=new Double("10.10");
		System.out.println(x.equals(y));//false
		System.out.println(x.equals(z));//true

		Character c= new Character('A');
		//Character c= new Character("AD"); //Not available
		System.out.println(c);
		
	}
}
