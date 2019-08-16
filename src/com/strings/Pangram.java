package com.strings;

import java.util.TreeSet;

/*Check weather given string contains all the characters[A-Z / a-z] are not*/

public class Pangram {
	static TreeSet<Character> tree = new TreeSet<>();

	public static void main(String[] args) {
		String s = "Nymphs blitz quick vex dwarf jog".toLowerCase();
		System.out.println(checkPangram(s));
		System.out.println(tree.size() == 26);
	}

	public static boolean checkPangram(String s) {
		int arr[] = new int[26];
		int index = 'a';
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				tree.add(ch);
				arr[ch - index] = 1;
			}
		}
		for (int ele : arr) {
			if (ele == 0)
				return false;
		}

		return true;
	}

}
