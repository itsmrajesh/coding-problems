package com.arrays;

import java.util.*;

public class MajorityElement {
	/*
	 * Given an array A of N elements. Find the majority element in the array. A
	 * majority element in an array A of size N is an element that appears more than
	 * N/2 times in the array.
	 * 
	 * INPUT: N = 5 , Array = 3 1 3 3 2
	 * 
	 * OUTPUT: 3
	 * 
	 * Explanation:Since, 3 is present more than N/2 times, so it is the majority
	 * element.
	 */
	public static void main(String[] args) {

		int N = 5;
		int arr[] = { 3, 1, 3, 3, 2 };
		int res = getMaxRep(N, arr);
		System.out.println(res);
	}

	private static int getMaxRep(int n, int[] arr) {
		int res = -1, c = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int ele : arr) {
			if (map.containsKey(ele)) {
				c = map.get(ele);
				c++;
				map.put(ele, c);
			} else
				map.put(ele, 1);
		}
		int max = n / 2;
		Set<Integer> set = map.keySet();
		for (int key : set) {
			if (map.get(key) >= max) {
				res = map.get(key);
			}
		}
		return res;
	}

}
