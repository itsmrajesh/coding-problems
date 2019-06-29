package com.hackerrank.practice;

import java.util.*;

public class MapPhoneBook {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int number = sc.nextInt();
			if (map.get(name) == null) {
				map.put(name, number);
			} else {

			}
		}
		while (sc.hasNext()) {
			String s = sc.next();
			if (map.get(s) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + map.get(s));
			}
		}

	}
}
