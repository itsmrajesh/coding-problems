package com.anonymous;

import java.util.Scanner;

public class Mindtree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		String arr[] = s.split(" ");
		String find = arr[1];
		int count = 0;
		for (char ch : arr[0].toCharArray()) {
			if (find.equals(""+ch)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
