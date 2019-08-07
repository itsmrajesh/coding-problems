package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

/*Print the first missing number to stdout 
 * 
 * EX:
 * arr={0,1,2}
 * 
 * output : 3
 * 
 * arr={-1,-2,3,2}
 * 
 * output : 1
 * 
 * */
public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int missingNumber = getMissing(arr, size);
		System.out.println(missingNumber);
	}

	public static int getMissing(int[] arr, int n) {
		int res;
		if (n <= 1) {
			return arr[0] >= 1 ? arr[0] + 1 : 1;
		}
		if (arr[0] > 1) {
			return 1;
		}
		for (int i = 0; i < n - 1; i++) {
			if (Math.abs(arr[i + 1]) - Math.abs(arr[i]) > 1) {
				res = arr[i + 1] - 1;
				if (res > 0) {
					return res;
				}
			}
		}

		return arr[n - 1] + 1;

	}

}
