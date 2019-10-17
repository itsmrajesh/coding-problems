package com.ieceedtraining;

public class SeriesPrint {
	// Print these series 0 1 3 6 10 15
	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(a + " ");
			// remove above comment to print series
			for (int j = 0; j < i; j++) {
				a++;
			}
		}
		System.out.println("nth number is :" + a); // for nth number
	}

}
