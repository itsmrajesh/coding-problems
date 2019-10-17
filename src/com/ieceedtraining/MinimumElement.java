package com.ieceedtraining;

public class MinimumElement {

	public static void main(String[] args) {
		int arr[] = { -1, 99, 2, 3, 4, 5, 6 };
		int min = findMimumElement(arr);
		System.out.println(min);
	}

	private static int findMimumElement(int[] arr) {
		
		
		// arr[] = { -1, 99, 2, 3, 4, 5, 6 };
		int arrayLength = arr.length;
		int min = arr[0];
		for (int i = 1; i < arrayLength; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
		
		
		
		
		
	}

}
