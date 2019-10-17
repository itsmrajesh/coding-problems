package com.ieceedtraining;

public class EmployeeHike {

	public static void main(String[] args) {
		double arunSal = 50000;
		double varunSal = 75000;

		arunSal += arunSal * 0.1;
		varunSal += varunSal * 0.25;
		System.out.println("Arun Sal : " + arunSal);
		System.out.println("varun sal : " + varunSal);
		System.out.println(arunSal > varunSal ? "Arun Sal is more " : "varun sal is more ");
	}

}
