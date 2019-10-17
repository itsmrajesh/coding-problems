package com.ieceedtraining;

public class NumberFrequenncy {

	public static void main(String[] args) {
		int arr[] = { 25, 5, 4, 22, 0, 24, 36, 85, 25, 41, 52, 25 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 25)
				count++;

		}
		if (count == 0)
			System.out.println("Not found");
		else
			System.out.println("Frequnecy of 25 is " + count);
	}

}
