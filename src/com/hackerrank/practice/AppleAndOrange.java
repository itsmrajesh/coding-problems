package com.hackerrank.practice;

public class AppleAndOrange {

	public static void main(String[] args) {
		int s = 7, t = 10, a = 4, b = 12;
		int apple[] = { 2, 3, -4 };
		int orr[] = { 3, -2, -4 };
		countApplesAndOranges(s, t, a, b, apple, orr);
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int lenA = apples.length;
		int lenO = oranges.length;
		int app[] = new int[lenA];
		int orr[] = new int[lenO];

		int appleCount = 0, orangeCount = 0;

		for (int i = 0; i < lenA; i++) {
			app[i] = a + (apples[i]);
		}

		for (int j = 0; j < lenO; j++) {
			orr[j] = b + (oranges[j]);
		}

		for (int k : app) {
			//System.out.println(k);
			if (k >= s && k <= t) {
				appleCount++;
			}
		}
		System.out.println();
		for (int m : orr) {
			//System.out.println(m);
			if (m >= s && m <= t) {
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
}
