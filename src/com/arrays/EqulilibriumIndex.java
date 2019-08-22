package com.arrays;

public class EqulilibriumIndex {

	/*
	 * Given an array A of N positive numbers. The task is to find the position
	 * where equilibrium first occurs in the array. Equilibrium position in an array
	 * is a position such that the sum of elements before it is equal to the sum of
	 * elements after it.
	 * 
	 *  test case 1 : arr = 1 3 5 2 2 
	 *  output for case 1 : 3
	 *  
	 *  test case 2 : arr =  1
	 *  output for case 1 : 1
	 *  
	 *  if no equilibrium occurs print -1 
	 * 
	 */

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 2, 2 };
		int len = arr.length;
		int sum = 0, leftSum = 0, index = -1;

		for (int ele : arr)
			sum += ele;

		for (int i = 0; i < len; i++) {
			sum -= arr[i];
			if (sum == leftSum) {
				index = ++i;
				break;
			}
			leftSum += arr[i];
		}
		System.out.println(index);
	}

}
