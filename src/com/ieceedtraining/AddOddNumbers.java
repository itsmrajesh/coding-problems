package com.ieceedtraining;

public class AddOddNumbers {
	/*
	 * Write a java program to define three integer variables "a","b" and "c",
	 * assign the values 11, 20 and 33 respectively. Add the numbers which are odd
	 * and print the result. As per this example, the odd numbers are 11 and 33.
	 * But, you should be able to change any values and the program should work.
	 */
	public static void main(String[] args) {
		int a, b, c;

		a = 11;
		b = 20;
		c = 33;
		int sum = 0;
		if (isOdd(a))
			sum += a;
		if (isOdd(b))
			sum += b;

		if (isOdd(c))
			sum += c;

		System.out.println("Sum is " + sum);

	}

	public static boolean isOdd(int num) {
		return num % 2 != 0;

		// for even number return num % 2 ==0

		// for multiple of 3 return num % 3 == 0
	}

}
