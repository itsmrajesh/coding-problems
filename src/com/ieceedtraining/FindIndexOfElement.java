package com.ieceedtraining;

public class FindIndexOfElement {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 100, 70, 80, 100, 60 };
		int ele = 100;// Integer.parseInt(args[0]);
		int len = arr.length;
		int i = 0, found = -1;
		for (int e : arr) {
			if (e == ele) {
				found++;
			}
		}
		for (; i < len; i++)
			if (arr[i] == ele)
				printPOS(i, len);

		if (found > 0) {
			System.out.println("Found Mulitple times");
		}
	}

	private static void printPOS(int i, int len) {
		if (i == 0)
			System.out.println("Found at starting");
		else if (i == len - 1)
			System.out.println("Found at end");
		else
			System.out.println("Found at middle");
		/*
		 * else System.out.println("Not found in given 3 positions");
		 */
	}

}
