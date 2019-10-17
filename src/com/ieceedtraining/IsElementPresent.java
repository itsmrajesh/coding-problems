package com.ieceedtraining;

public class IsElementPresent {

	public static void main(String[] args) {
		int num = 50;
		int arr[] = { 10, 2, 0, 30, 4, 50, 55 };
		boolean isPresent = true;
		for (int ele : arr) {
			if (num == ele) {
				System.out.println("Element Present in a given array");
				isPresent = false;
				break;
			}
		}
		if (isPresent) {
			System.out.println("Element not Present in a given array");
		}
	}

}
