package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no of elements in array
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); //input array 
		}
		int sum = sc.nextInt(); //enter how much sum 
		int[] res=getTwoSum(arr, sum);
		System.out.println(Arrays.toString(res)); //returns the index's of elements == sum 

	}

	private static int[] getTwoSum(int[] arr, int sum) {
		int res[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] + arr[j] == sum) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}

}
