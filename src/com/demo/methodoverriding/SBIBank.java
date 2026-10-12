package com.demo.methodoverriding;

public class SBIBank extends RBIBank {

	// overriding parent method to give my own rofi

	double getHomeLoanRofi() {
		return 12.85;
	}

	public String applyHomeLoan() {
		boolean status = checkElgibility(); // parent method
		if (status) {
			double homeLoanRofi = getHomeLoanRofi(); // child method
			String msg = "Your loan approved with RI as ::" + homeLoanRofi;
			return msg;
		} else {
			return "You are not elgible for home loan";
		}
	}

	public static void main(String[] args) {
		SBIBank bank = new SBIBank();
		String msg = bank.applyHomeLoan();
		System.out.println(msg);
	}

	public boolean equals(Object obj) {
		return obj instanceof SBIBank;
	}

}
