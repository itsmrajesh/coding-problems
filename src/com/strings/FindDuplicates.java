package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int c = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (char key : ch) {
			if (key != ' ')
				if (map.containsKey(key)) {
					c = map.get(key);
					c++;
					map.put(key, c);
				} else {
					map.put(key, 1);
				}
		}

		c = 0;
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			c = map.get(key);
			if (c > 1) {
				System.out.print(key + " ");
			}
		}

	}

}
