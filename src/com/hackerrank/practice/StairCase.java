package com.hackerrank.practice;

public class StairCase {

	public static void main(String[] args) {
		int n=6; //change accordingly
		//printStairCase(n);
		printStairCase2(n);
		

	}

	private static void printStairCase2(int n) {
		String str="#";
		for(int i=0;i<n;i++) {
			System.out.printf("%"+n+"s\n",str);
			str +="#";
		}
		
	}

	private static void printStairCase(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
