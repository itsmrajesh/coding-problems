package com.codingclub;

import java.util.Scanner;

public class HateZero {
	/*
	 * Problem statement:
	 * https://wemissionhack.blogspot.com/2019/10/ncet-codingclub-programming-
	 * questions.html?m=1
	 */
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		a = getZeroFree(a);
		b = getZeroFree(b);
		c = getZeroFree(c);
		d = getZeroFree(d);
		if (a + b + c == d)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	private static int getZeroFree(int num) {
		String str = "" + num; // converting to string
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				sb.append(str.charAt(i));
			}
		}

		return Integer.parseInt(sb.toString());
	}

}
