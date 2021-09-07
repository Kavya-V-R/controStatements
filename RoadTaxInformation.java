package com.xworkz.controlStatements;

public class RoadTaxInformation {
	public static void main(String[] args) {
		int roadTax;
		String state = "KA";
		if (state == "KA") {
			roadTax = 2000;
			System.out.println("The road tax in karnataka=" + roadTax);
		} else if (state == "TN") {
			roadTax = 3500;
			System.out.println("The road tax in tamilnadu=" + roadTax);
		} else if (state == "AP") {
			roadTax = 2500;
			System.out.println("The road tax in Andhrapradesh=" + roadTax);
		}

	}
}
