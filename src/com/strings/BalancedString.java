package com.strings;

import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		String str = "{[{{}}]}";
		System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
	}

	private static boolean isBalanced(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		for (char ch : str.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			} else if (stack.isEmpty()) {
				return false;
			} else if (!isMatch(stack.pop(), ch)) {
				return false;
			}
		}

		return stack.isEmpty();
	}

	private static boolean isMatch(Character pop, char ch) {

		if (pop == '[' && ch == ']') {
			return true;
		} else if (pop == '{' && ch == '}') {
			return true;
		} else if (pop == '(' && ch == ')') {
			return true;
		}

		return false;
	}

}
