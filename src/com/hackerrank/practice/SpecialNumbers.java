package com.hackerrank.practice;

import java.util.*;

public class SpecialNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		long specialProduct=1;
		
		for (int element : arr) {
			if(check(element)) {
				specialProduct *= element;
			}
		}
		System.out.println(specialProduct);
	}

	private static boolean check(int num) {
		boolean oneZeroFLag = false,repeatFlag=false;
		Set<Integer> set = new HashSet<>();
		while (num > 0) {
			int rem = num % 10;
			if (rem == 1) {
				if (set.contains(rem)) {
					repeatFlag = true;
				} else
					set.add(rem);

			} else {
				set.add(rem);
			}
			num /= 10;
		}
		if(set.contains(1)&&set.contains(0)) {
			oneZeroFLag=true;
		}
		return oneZeroFLag&&!(repeatFlag);
	}

}
