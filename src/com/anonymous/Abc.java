package com.anonymous;

import java.util.*;

public class Abc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt();
		String arr[][] = new String[n][n];
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.next();
				c[i] = sc.nextInt();
			}
		}
		int res = getRes(arr, c, n, a);
		System.out.print(res);

	}

	private static int getRes(String[][] arr, int[] c, int n, int D) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[j][j] == arr[i + 1][j + 1] && arr[i][j + 1] == arr[i + 1][j]) {
					if (c[i + 1] - c[i] == D) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
