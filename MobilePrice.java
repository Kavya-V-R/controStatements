package com.xworkz.controlStatements;

public class MobilePrice {
	public static void main(String[] args) {
		int iphoneVersion=10;
		int price;
		if(iphoneVersion==5) {
			price=50000;
			System.out.println("iphone5 price="+price);
		}
		else if(iphoneVersion==8) {
			price=55000;
			System.out.println("iphone8 price="+price);
		}
		else if(iphoneVersion==10) {
			price=60000;
			System.out.println("iphone10 price+"+price);
		}
	}

}
