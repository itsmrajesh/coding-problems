package com.anonymous;

import java.util.*;

public class SpecialNumbers {

	static Map<Integer, Long> map = new HashMap<>();

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			long sum = 0;
			/*
			 * while (l <= r) { System.out.println(getSpecialNumber(l)); sum +=
			 * getSpecialNumber(l); l++; }
			 */
			System.out.println(sum);
			T--;
		}

	}

	private static long getSpecialNumber(int l) {
		if (l <= 5) {
			return 5;
		}
		if (map.get(l) != null) {
			return map.get(l);
		} else {
			long special = l;
			while (true) {
				if (isSpecial(special)) {
					map.put(l, special);
					return map.get(l);
				} else {
					special++;
				}

			}
		}
		// return 0;
	}

	private static boolean isSpecial(long l) {
		String str = "" + l, s = "";

		for (int i = 0; i < str.length(); i++) {
			s = "" + str.charAt(i);
			System.out.println(l);
			if (!s.equals("2") || !s.equals("5")) {
				return false;
			}
		}
		return true;
	}
}
