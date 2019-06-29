package com.hackerrank.practice;

public class VeryBigSum {

	public static void main(String[] args) {
		long arr[]=new long[20];
		for(int i=0;i<arr.length;i++) {
			arr[i]=10840005;
		}
		long bigSum=aVeryBigSum(arr);
		System.out.println(bigSum);
	}
	 static long aVeryBigSum(long[] ar) {
         long sum=0;
         for(int i=0;i<ar.length;i++){
             sum +=ar[i];
         }
     return sum;
 }

}
