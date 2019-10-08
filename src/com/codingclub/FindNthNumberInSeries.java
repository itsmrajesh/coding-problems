package com.codingclub;

public class FindNthNumberInSeries {

	public static void main(String[] args) {
		// Series: 1 5 13 25 41 61 85 113
		//input: n=7 output: 85
		int n = 7;
		int sqrt = 1, prev = 0, res = 0;
		for (int i = 1; i <= n; i++) {
			res = prev+sqrt;
			System.out.print(res+" ");
			prev=sqrt;
			sqrt = (i+1)*(i+1);
		}
		System.out.println("\n"+n+" term is "+res);
	}

}
/* Logic:-
 5 = 1 + 4 (sum of squares of two perfect integers)
 13 = 4 + 9
 25 = 9 + 16
 41 = 16 + 25
 61 = 25 + 36
*/