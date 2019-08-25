package com.anonymous;

import java.util.*;

public class FibnocciSeries {
	
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.print(fibnocci_1(i)+" ");
		}
		
	}

	private static int fibnocci_1(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		if (n > 2) {
			return fibnocci_1(n - 1) + fibnocci_1(n - 2);
		}

		return 0;
	}

}
