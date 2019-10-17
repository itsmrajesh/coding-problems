package com.ieceedtraining;

public class CommandLineArguments {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String op = args[2];
		switch (op) {
		case "add":
			System.out.println(Calculator.add(num1, num2));
			break;
		case "sub":
			System.out.println(Calculator.sub(num1, num2));
			break;
		case "mul":
			System.out.println(Calculator.mul(num1, num2));
			break;
		case "div":
			System.out.println(Calculator.div(num1, num2));
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
