package com.anonymous;

public class MathsOp {

	public static void main(String[] args) {

		System.out.println(add(1, 2));

		System.out.println(add(1, 2, 3));
	}

	private static int add(int... arr) {
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;
	}

}
