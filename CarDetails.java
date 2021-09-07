package com.xworkz.controlStatements;

public class CarDetails {
	public static void main(String[] args) {
		String car = "kia";
		switch (car) {
		case "toyota":
			System.out.println("tayota innova has Engine capacity 1998cc with 179kmh");
			break;
		case "honda":
			System.out.println("honda city has engine capacity 1498cc with 170kmh");
			break;
		case "tata":
			System.out.println("tata nexan has engine capacity 1999cc with 180kmh");
			break;
		case "kia":
			System.out.println("kia seltos has engine capacity 1499cc with 167kmh");
			break;
		case "maruthi":
			System.out.println("maruthi suzuki has engine capacity 1997cc with 150kmh");
			break;
		default:
			System.out.println("No information");
		}
	}

}
