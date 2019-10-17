package com.ieceedtraining;

public class EmployeeAndTax {

	public static void main(String[] args) {
		double tax, sal = 2500;
		if (sal > 2000) {
			tax = getTaxAmount(sal, .3);
		} else {
			tax = getTaxAmount(sal, .2);
		}
		System.out.println("Net Salary is " + (sal - tax));
	}

	private static double getTaxAmount(double sal, double d) {

		return sal * d;

	}

}
