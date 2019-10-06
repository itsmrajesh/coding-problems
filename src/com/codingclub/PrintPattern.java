package com.codingclub;

public class PrintPattern {
//Problem Statement https://wemissionhack.blogspot.com/2019/10/ncet-codingclub-programming-questions.html?m=1
	public static void main(String[] args) {
		int i = 0, n = 4;// Input
		char ch = '1';
		String s = "";
		for (i = 0; i < n; i++) {
			s += ch; 
			ch++;
		}
		String rev = new StringBuffer(s).reverse().toString();
		ch = s.charAt(i - 1);
		for (int j = 0; j < n; j++) {
			System.out.print(s);
			System.out.print("*");
			System.out.print(rev);
			s = s.replace(ch, '*');
			rev = rev.replace(ch, '*');
			ch--;
			System.out.println();
		}
	}

}
