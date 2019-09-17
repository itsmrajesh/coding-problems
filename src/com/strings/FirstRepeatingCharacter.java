package com.strings;

public class FirstRepeatingCharacter {
	/* Write a method which returns first repeating character in given word */
	public static void main(String[] args) {
		String s = "abcedfghikljj";
		char ch = getFirstRepeatingCharacter(s);
		System.out.println(ch);
	}

	private static char getFirstRepeatingCharacter(String s) {
		char arr[] = s.toCharArray();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}

}
