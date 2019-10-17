package com.ieceedtraining;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		int len = str.length() - 1;
		boolean isPal = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(len)) {
				isPal = false;
				break;
			}
			len--;
		}
		if (isPal)
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a Palindrome");
	}

}
