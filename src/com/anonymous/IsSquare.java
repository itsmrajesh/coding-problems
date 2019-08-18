package com.anonymous;

public class IsSquare {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(isSquare(num));
		double sqrt = Math.sqrt(num);
		System.out.println(Math.floor(sqrt*sqrt)==num);
	}

	private static boolean isSquare(int n) {
		if (n == 0)
			return true;

		for (int i = 1; i * i <= n; i++) {
			if ((n % i == 0) && (n / i == i)) { 
				return true; 
			}
		}

		return false;
	}

}
