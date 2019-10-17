package com.ieceedtraining;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 123215;
		System.out.println("Given number : " + num);
		int temp = num;
		int rem, rev=0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Reversed Number : " + rev);
		System.out.print("Number is ");
		if (temp == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
