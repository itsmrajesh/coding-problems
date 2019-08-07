package com.leetcode;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int orginalSum = n * (n + 1) / 2, arrSum = 0;
		for (int ele : arr)
			arrSum += ele;
		System.out.println(orginalSum - arrSum);
	}

}
