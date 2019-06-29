package com.hackerrank.practice;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 5, 8, 0, 7, 55, 4 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] revArr = reverseArray(arr);
		
		for (int j : revArr) {
			System.out.print(j + " ");
		}
	}

	static int[] reverseArray(int[] a) {
		int len = a.length;
		int revArr[] = new int[len];
		int j = 0;
		for (int i = len - 1;; i--) {
			if (i < 0)
				break;
			else
				revArr[j] = a[i];
			j++;
		}
		return revArr;
	}
}
