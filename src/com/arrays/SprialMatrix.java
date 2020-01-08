package com.arrays;

import java.util.Scanner;

public class SprialMatrix {
// Given a 2D matrix, print it in sprial form
	public static void main(String[] args) {
		int row = 3, col = 3;
		int arr[][] = new int[row][col];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		print_sprial(row, col, arr);
	}

	private static void print_sprial(int row, int col, int[][] arr) {
		int k = 0, l = 0, i = 0;
		while (k < row && l < col) {
			for (i = l; i < col; i++) {
				System.out.print(arr[k][i] + " ");
			}
			k++;

			for (i = k; i < row; i++) {
				System.out.print(arr[i][col - 1] + " ");
			}
			col--;

			if (k < row) {
				for (i = col - 1; i >= l; i--) {
					System.out.print(arr[row - 1][i] + " ");
				}
				row--;
			}
			if (l < col) {
				for (i = row - 1; i >= k; i--) {
					System.out.print(arr[i][l] + " ");
				}
				l++;
			}

		}
	}

}
