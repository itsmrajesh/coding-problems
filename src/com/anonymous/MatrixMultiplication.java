package com.anonymous;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, p, q;
		System.out.println("Enter rows and colums for Matrix A");
		m = sc.nextInt();
		n = sc.nextInt();
		int arrA[][] = new int[m][n];
		System.out.println("Enter Elements in Matrix A");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				arrA[i][j] = sc.nextInt();

		System.out.println("Enter rows and colums for Matrix B");
		p = sc.nextInt();
		q = sc.nextInt();
		// rows should be equal to column
		if (n == p) {
			System.out.println("Enter Elements in Matrix B");
			int arrB[][] = new int[p][q];
			for (int i = 0; i < p; i++)
				for (int j = 0; j < q; j++)
					arrB[i][j] = sc.nextInt();

			int arrAB[][]=getMatrixMul(arrA,arrB,m,q,p);
			System.out.println("Dot Product or Matrix Multiplication of Matrix A and Matrix B");
			for(int[] ele : arrAB) {
				for(int e:ele) {
					System.out.print(e+" ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrix Multiplication is not possiable");
		}
	}

	private static int[][] getMatrixMul(int[][] arrA, int[][] arrB, int m, int q, int p) {
		int arrAB[][] = new int[m][q];
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				for (int k = 0; k < p; k++) {
					sum += arrA[i][k] * arrB[k][j];
				}
				arrAB[i][j] = sum;
				sum = 0;
			}
		}
		return arrAB;
	}
}
