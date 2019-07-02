package com.hackerrank.practice;

import java.util.*;

public class SearchArray {
//find the index's of element(target) in the given array
//Test case arr[]= {5,7,7,8,8,10}, target=8 return an array {3,4}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int arr[] = { 5, 7, 7, 8, 8, 10 }, target = 8;

		int result[] = getSearchIndex(arr, target);
		for (int k : result)
			System.out.println(k);
	}

	private static int[] getSearchIndex(int arr[], int target) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				list.add(i);
			}
		}
		int indexedArr[] = new int[list.size()];
		if(list.size()>0)
		for (int j = 0; j < list.size(); j++) {
			indexedArr[j] = list.get(j);
		}
		else {
			
		}

		return indexedArr;
	}

}
