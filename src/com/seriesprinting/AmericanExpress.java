package com.seriesprinting;

import java.util.Scanner;

public class AmericanExpress {
	private static int var = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int count = 0, limit = N / 2;
		for (int i = 1; i <= limit; i++) {
			for (int j = 0; j < i; j++) {
				if (count < N) {
					printNum();
					count++;
				}
				if (count < N) {
					System.out.print(i + " ");
					count++;
				}
			}
		}
	}

	private static void printNum() {
		System.out.print(var + " ");
		if (var == 1) {
			var += 1;
		} else {
			var += 2;
		}
	}

}
