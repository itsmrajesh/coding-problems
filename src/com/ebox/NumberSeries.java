package com.ebox;

import java.util.Scanner;

public class NumberSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1, p = 2;
		for (int i = 0; i < n/2; i++) {
			System.out.print(" " + 3 * c++ + " ");
			if (isPrime(p)) {
				System.out.print(p);
				p++;
			} else {
				while (true) {
					if (isPrime(p)) {
						System.out.print(p);
						p++;
						break;
					} else
						p++;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
