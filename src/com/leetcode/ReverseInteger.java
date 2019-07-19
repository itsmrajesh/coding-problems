package com.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
			int num=123;
			reverse(num);
	}

	private static int reverse(int num) {
		int rev=0;
		if(num<0)
		{
			while(num>0) {
				int ld=num%10;
				rev = rev*10+ld;
				num /=10;
			}
			rev = rev*(-1);
		}
		else {
			while(num>0) {
				int ld=num%10;
				rev = rev*10+ld;
				num /=10;
			}
		}
		
		return rev;
	}

}
