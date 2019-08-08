package com.strings;

import java.util.*;

/* Write an efficient Java/C/Python program to return the maximum occurring character in the input string 
 * e.g., if the input string is "Java" then the function should return 'a'.
 * 
 */
public class MaxOccurenceOfLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		int c = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (char key : ch) {
			if (map.containsKey(key)) {
				c = map.get(key);
				c++;
				map.put(key, c);
			} else {
				map.put(key, 1);
			}

		}
		c = 0;
		int max = 0;
		Character mostReapted = null;
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			c = map.get(key);
			if (c > max) {
				max = c;
				mostReapted = key;
			}
		}
		System.out.println(mostReapted);
	}

}
