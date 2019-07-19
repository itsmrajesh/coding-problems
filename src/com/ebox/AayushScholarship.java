package com.ebox;

import java.util.Arrays;
import java.util.Scanner;

public class AayushScholarship {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==2)
				System.out.println("NO");
			    System.exit(0);
		}
		Arrays.sort(arr);
		System.out.println(isSchloar(arr));
		sc.close();

	}

	private static String isSchloar(int[] arr) {
		int sum = 0;
		if (arr[0] <= 2 && arr[4] != 5) {
			return "NO";
		} else {
			for (int i = 0; i < 5; i++) {
				sum += arr[i];
			}
		}
		return sum / 5 >= 4 ? "YES" : "NO";
	}

}
