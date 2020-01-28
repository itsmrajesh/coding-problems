package com.numbers;

public class Denominations {

	public static void main(String[] args) {
		int n = 5698;
		String num = String.valueOf(n);
		int size = num.length()-1, count = 1;
		for(char ch : num.toCharArray()) {
			int digit = Integer.parseInt(""+ch);
			int res = (int)Math.pow(10, size--);
			System.out.println(digit+"*"+res+" = "+(digit*res));
		}
	}

}
