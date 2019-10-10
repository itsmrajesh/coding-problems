package com.codingclub;

import java.util.Scanner;

public class UniqueNumber {
	// n=1234 is unique number
	// n=1232 is not unique number because 2 is repeated
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isUniqueNumber(n) ? "Unique Number" : "Not a Unique Number");
	}

	private static boolean isUniqueNumber(int n) {
		String s = "";
		int rem;
		while (n > 0) {
			rem = n % 10;
			if (s.contains("" + rem)) {
				return false;
			}
			s += rem;
			n /= 10;
		}
		return true;
	}

}
