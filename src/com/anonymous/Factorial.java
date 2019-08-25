package com.anonymous;

public class Factorial {
	private static int c=0;
	public static void main(String[] args) {
		int n = 5;
		System.out.println(getFactorial(n));
	}

	private static int getFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * getFactorial(n - 1);
		}
	}

}
