package com.anonymous;

public class SquareDigits {

	public static void main(String[] args) {
		int n = 9119; // output is 811181 ,explanation 9 square is 81 and 1 square is 1 res = 81-1-1-81
		int res = squareDigits(n);
		System.out.println(res);
	}

	public static int squareDigits(int n) {
		char[] ch = String.valueOf(n).toCharArray();
		StringBuilder sb = new StringBuilder();
		int square;
		for (int i = 0; i < ch.length; i++) {
			square = Integer.parseInt("" + ch[i]);
			sb.append(square*square);
		}
		int res = Integer.parseInt(sb.toString());
		return res;
	}

	

}
