package com.leetcode;

public class BuySellStockProfit {

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(allTimeProfit(arr));
		System.out.println(oneProfit(arr));
	}

	public static int allTimeProfit(int arr[]) {
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				profit += arr[i] - arr[i - 1];
			}
		}
		return profit;
	}

	public static int oneProfit(int arr[]) {
		int len = arr.length;

		if (len <= 1)
			return 0;

		int minPrice = arr[0];
		int maxProfit = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - minPrice > maxProfit) {
				maxProfit = arr[i] - minPrice;
			}
			if (arr[i] < minPrice) {
				minPrice = arr[i];
			}
		}
		return maxProfit;
	}
}
