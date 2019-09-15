package com.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All_A_Togather {
/*Print all A's together and rest all at there respective postions 
 * 
 * Ex: Input :- ababacada
 * 	   Output :- aaaaabbcd	
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = getA(str);
		System.out.print(res);
	}

	public static String getA(String s) {
		String res = "";
		List<Character> list = new ArrayList<>();
		int c = 0;
		s.toCharArray();
		for (char ch : s.toCharArray()) {
			if (ch == 'a' || ch == 'A') {
				list.add(c, ch);
				c++;
			} else {
				list.add(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Character cc : list) {
			sb.append(cc);
		}

		res = sb.toString();

		return res;
	}

}
