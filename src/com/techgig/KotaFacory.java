package com.techgig;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;

public class KotaFacory {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			int groups = getGroups(arr, N);
			System.out.println(groups);
			T--;
		}

	}

	public static int getGroups(int[] arr, int N) {
		int res = 0, i = 0, rotate = 0;
		for (;;) {
			int a = arr[0], b = arr[1], c = arr[2];
			int gcd = getGCD(a * b, c);
			if (gcd == 1)
				res++;
			if (rotate <= N) {
				rotateArrToleft(arr, N);
				rotate++;
			} else {
				break;
			}
		}

		return res == 0 ? 0 : res + 1;
	}

	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;
		else {
			return getGCD(b, a % b);
		}
	}

	public static void rotateArrToleft(int[] arr, int N) {
		int i, temp = arr[0];
		for (i = 0; i < N - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}
}
