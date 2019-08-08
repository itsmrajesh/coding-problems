package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sub = sc.next();
		char[] ch = s.toCharArray();
		char[] subCh = sub.toCharArray();
		String c;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			c = "" + ch[i];
			if (!sub.contains(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);

	}

}
