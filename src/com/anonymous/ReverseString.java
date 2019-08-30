package com.anonymous;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverse("hello i am good"));
	}

	private static String reverse(String string) {

		String res = "";
		String arr[] = string.split(" ");
		for (String ss : arr) {
			res += new StringBuilder(ss).reverse().toString();
			res += " ";
		}

		return res;
	}
}
