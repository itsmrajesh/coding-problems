package com.anonymous;

public class HighTree {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 1, 2 };
		int n = 4;
		int res[] = getMax(arr, n);
		System.out.println(res[0]);
		System.out.print(res[1] + " " + res[2]);

	}

	private static int[] getMax(int[] arr, int n) {
		int i, j, len = arr.length;
		for (i = 0; i < len; i++) {
			for (j = 1; j < len; j++) {
				if (arr[i] <= arr[j]) {
					return new int[] { j, i, j };
				}
			}
		}
		return new int[] { 0, 0, 0 };
	}

}
