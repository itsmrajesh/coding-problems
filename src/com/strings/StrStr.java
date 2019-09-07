package com.strings;

import java.util.Arrays;

public class StrStr {

	public static void main(String[] args) {
		String s1 = "GeeksForGeeks";
		String s2 = "Fr";
		int res = strStr(s1, s2);
		System.out.println(res);
	}

	private static int strStr(String s1, String s2) {
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		int m = s1.length(), n = arr2.length, c = 0;
		for (int i = 0; i < m; i++) {
			if (arr2[c] == arr1[i]) {
					
			}
		}
		return -1;
	}

}
