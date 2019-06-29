package com.hackerrank.practice;

import java.util.*;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 2, 1, 3, 4, 5 };
		int count=birthdayCakeCandles(arr);
		System.out.println(count);
	}

	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length, count = 0;
		int maxCandelHeight = ar[len - 1];
		for (int i : ar) {
			if (i == maxCandelHeight) {
				count++;
			}
		}
		return count;
	}
}
