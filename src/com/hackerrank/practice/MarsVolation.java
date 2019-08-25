package com.hackerrank.practice;

public class MarsVolation {

	public static void main(String[] args) {
		String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
		System.out.println(s);
		int res = marsExploration(s);
		System.out.println(res);
	}

	private static int marsExploration(String s) {
		int count = 0, len = s.length();
		for (int i = 0; i <= len - 3; i = i + 3) {
			if (s.charAt(i) != 'S') {
				count++;
			}
			if (s.charAt(i + 1) != 'O') {
				count++;
			}
			if (s.charAt(i + 2) != 'S') {
				count++;
			}
		}

		return count;
	}

}
