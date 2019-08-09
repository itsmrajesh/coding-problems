package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		s1 = getSorted(ch1);
		s2 = getSorted(ch2);
		System.out.println(s1.equals(s2) ? "Anagram" : "Not Anagram");
	}

	private static String getSorted(char[] ch) {
		Arrays.sort(ch);
		return String.valueOf(ch);
	}

}
