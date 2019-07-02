package com.hackerrank.practice;

import java.util.Arrays;

public class FirstMissingElement {

	public static void main(String[] args) {
		int arr[] = { 3, 4, -1, 1 };
		int missing = getFirstMissingNumber(arr);
		System.out.println("missing element");
		System.out.println(missing);
	}

	private static int getFirstMissingNumber(int[] arr) {
		int index = 0, missing = 0;
		Arrays.sort(arr);
		for (;;) {
			if (index == arr.length - 1)
				break;
			int pre = arr[index];
			int next = arr[index + 1];
			if (pre + 1 != next) {
				if (pre > 0) {
					missing = pre + 1;
				}
			}
			index++;
		}
		return missing;
	}

}
