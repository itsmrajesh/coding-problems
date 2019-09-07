package com.arrays;

public class DiagonalDifference {
	/*Find the diagonal difference of 2D Square(rows == columns) matrix  */

	public static void main(String[] args) {
			int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			int res =  getDiff(arr);
	}

	private static int getDiff(int[][] arr) {
		int n=arr.length,lSum=0,rSum=0;
		for(int i=0;i<n;i++) {
			lSum += arr[i][i];
			rSum += arr[i][n-i-1];
		}
		System.out.println(lSum+" "+rSum);
		return 0;
	}

}
