package com.ieceedtraining;

public class SumOfArray {
	// find the sum of array for all elements divisible by 2
	public static void main(String[] args) {
		int arr[] = { -41, -21, 21, 21, 43, 5, -23,2,4,6 };
		int flag = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
				if (arr[i] < 0) {
					flag++;
				}
			}
		}
		if (sum <= 0 && flag == 0)
			System.out.println("No element is divisible by 2");
		else
			System.out.println("Sum of element is divisible by 2 is " + sum);
	}

}
