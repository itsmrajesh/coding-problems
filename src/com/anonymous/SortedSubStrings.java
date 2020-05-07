package com.anonymous;

import java.util.Set;
import java.util.TreeSet;

public class SortedSubStrings {
	
	public static void main(String[] args) {
		String s = "baca";
		String result = getSubStrings(s);
		System.out.println(result);
	}

	private static String getSubStrings(String s) {
		int len = s.length();
		TreeSet<String> set = new TreeSet<String>();
		for(int i=0,j=0;i<len;i++,j++) {
			Set<String> res = getRes(s,i,j,len);
			set.addAll(res);
		}
		return set.last();
	}

	private static Set<String> getRes(String s, int i,int j, int len) {
		Set<String> set = new TreeSet<String>();
		for(;i<len;i++) {
			String ss = s.substring(j, i+1);
			set.add(ss);
		}
		return set;
	}
}
