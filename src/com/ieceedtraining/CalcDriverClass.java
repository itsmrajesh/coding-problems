package com.ieceedtraining;

public class CalcDriverClass {

	public static void main(String[] args) {
		System.out.println(Calculator.add(10, 20));
		System.out.println(Calculator.sub(10, 20));
		System.out.println(Calculator.mul(20, 30));
		System.out.println(Calculator.div(20, 0));

	}

}

class Calculator {
	public static int add(int a, int b) {
		System.out.print("Addition of " + a + " and " + b + " is : ");
		return a + b;
	}

	public static int sub(int a, int b) {
		System.out.print("Substraction of " + a + " and " + b + " is : ");
		return Math.abs(a - b);
	}

	public static int mul(int a, int b) {
		System.out.print("Multiplication of " + a + " and " + b + " is : ");
		return a * b;
	}

	public static int div(int a, int b) {
		if (b <= 0) {
			System.out.println("Enter valid divider value");
			return 0;
		}
		System.out.print("Division of " + a + " and " + b + " is : ");
		return a / b;
	}
}
