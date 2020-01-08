package com.strings;

import java.util.Scanner;

/*ex 1 : +123 output 123 
 * ex 2: -456 output 456
 * ex 3: 745 output 745 
 *  */
public class StringToInteger {

	public static void main(String[] args) {
		// 30-39
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		int len = s.length();
		
		for (int i = 0; i < len; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				System.out.print(ch[i]); // printing 
			}
		}
	}

}
