package com.hackerrank.practice;

/* CollatzSequence means output should end with 4 2 1 Problem Explanation -> if num is even then divide num 2 if num is odd multiply by 3 and increment by one */
public class CollatzSequence {
	public static void main(String[] args) {
		int num = 5; // userinput
		System.out.println(num);
		while (num != 1) {
			if (isEven(num)) {
				num /= 2;
				System.out.println(num);
			} else {
				num = (num * 3) + 1;
				System.out.println(num);
			}
		}
	}

	private static boolean isEven(int num) {

		return num % 2 == 0;
	}
}
