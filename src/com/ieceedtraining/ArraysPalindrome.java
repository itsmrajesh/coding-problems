package com.ieceedtraining;

public class ArraysPalindrome {

	public static void main(String[] args) {
		int arr[] = { 5, 15, 25, 25, 15, 50 };
		int len = arr.length;
		boolean isPal = true;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[len - 1]) {
				isPal = false;
				break;
			}
			len--;
		}
		if (isPal) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
