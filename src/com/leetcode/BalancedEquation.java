package com.leetcode;

import java.util.Stack;

public class BalancedEquation {
	static Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		String str = "(({{[[]]}}))"; //give your own input of balanced equation
		int len = str.length();
		boolean isBal = false;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push("" + ch);
			} else {
				if (stack.isEmpty()) {
					break;
				} else {
					String ele = stack.pop();
					if (isMatch(ele, "" + ch)) {
						isBal = true;
					}
				}
			}
		}

		if (isBal && stack.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static boolean isMatch(String p1, String p2) {
		if (p1.equals("[") && p2.equals("]")) {
			return true;
		} else if (p1.equals("{") && p2.equals("}")) {
			return true;
		} else if (p1.equals("(") && p2.equals(")")) {
			return true;
		}

		return false;
	}

}
