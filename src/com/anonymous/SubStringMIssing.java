package com.anonymous;

import java.util.ArrayList;
import java.util.List;

public class SubStringMIssing {

	public static void main(String[] args) {
		String s = "i like cheese lollikelollike";
		String ss = "like";
		List<String> list = getMissingWords(s, ss);
		System.out.println(list);
	}

	private static List<String> getMissingWords(String s, String ss) {
		List<String> list = new ArrayList<>();

		String[] arr = s.split(" ");

		int len = ss.length();

		for (String word : arr) {
			if (len > word.length()) {
				list.add(word);
			} else {
				if (word.contains(ss)) {
					String[] ar = word.split(ss);
					if(ar.length>0) {
						String missing = String.join("", ar);
						list.add(missing);
					}
				}else {
					list.add(word);
				}
			}
		}

		return list;
	}

}
