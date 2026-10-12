package com.demo.interface_ex;
public class BankDemo {

	public static void main(String[] args) {
		Bank b; // reference variable

		b = new AxisBank(); // storing impl obj into ref variable

		b.moneyTransfer(); // axis-bank method will be called
		b.checkBalance(); // axis-bank method will be called
 
		b = new HdfcBank();  // storing impl obj into ref variable

		b.moneyTransfer(); // hdfc-bank method will be called
		b.checkBalance(); // hdfc-bank method will be called
	}
}