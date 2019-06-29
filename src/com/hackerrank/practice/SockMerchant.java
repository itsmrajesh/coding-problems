package com.hackerrank.practice;

import java.util.*;

public class SockMerchant {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 30, 20, 40, 44, 30 };
		int pairs = sockMerchant(arr.length, arr);
		System.out.println(pairs);
	}

	static int sockMerchant(int n, int[] arr) {
		Arrays.sort(arr);
		int pairs = 0, len = arr.length;
		for (int i = 0; i < len;) {
			if (i == len - 1) {
				break;
			} else if (arr[i] == arr[i + 1]) {
				pairs++;
				i = i + 2;
			} else if (arr[i] != arr[i + 1]) {
				i = i + 1;
			}
		}
		return pairs;
	}

}
