package com.strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sArr[] = s.split(" ");
		int len = sArr.length;
		for(int i=len-1;i>=0;i--)
			System.out.print(sArr[i]+" ");
	}

}
