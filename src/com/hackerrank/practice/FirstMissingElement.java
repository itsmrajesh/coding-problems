package com.hackerrank.practice;

import java.util.Arrays;
//find the next postive missing number in the given array 
// Test case arr={-5,-5,4,1,2} function should return 3 as missing number
public class FirstMissingElement {

	public static void main(String[] args) {
		int arr[] = { -1,1,2 ,3};
		int missing = getFirstMissingNumber(arr);
		System.out.println("Missing element : "+missing);
	}

	private static int getFirstMissingNumber(int[] arr) {
		int index = 0, missing = 0;
		Arrays.sort(arr);
		//0 1 2 
		if(arr.length==0) return 1;
		for (;;) {
			if (index == arr.length - 1)
				break;
			int pre = arr[index];
			int next = arr[index + 1];
			if (pre + 1 != next) {
				if (pre+1 > 0) {
					missing = pre + 1;
					return missing;
				}
			}
			index++;
		}
		return arr[arr.length-1]+1;
	}

}
