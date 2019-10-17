package com.ieceedtraining;

public class PrintASCII {

	public static void main(String[] args) {
		String s = "LION";
		for (char ch : s.toCharArray()) {
			System.out.print((int) ch+" ");
		}
	}

}
