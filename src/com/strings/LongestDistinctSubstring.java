package com.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubstring {

	public static void main(String[] args) {
			String s = "abababcdefababcdab";
			int res=getLongestDistinctSubstring(s);
			System.out.println(res);
	}

	private static int getLongestDistinctSubstring(String s) {
		int len = s.length(),max=0;
		String sub= "";
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<=len;j++) {
				sub = sb.substring(i, j);
				if(isSub(sub)) {
					if(sub.length()>max) {
						max=sub.length();
					}
				}
			}
		}
		return max;
	}

	private static boolean isSub(String substring) {
		Set<Character> set = new HashSet<>();
		for(char ch : substring.toCharArray()) {
			if(set.contains(ch))
				return false;
			else
				set.add(ch);
		}
		return true;
	}

}
