package com.ebox;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next().toLowerCase();
		System.out.println(isRoutine(s));
	}

	private static String isRoutine(String s) {
		boolean routine=false;
			if(s.length()<2)
			{
				return "NO";
			}
			else
			{
				StringBuffer sb = new StringBuffer();
				Set<Character> st = new HashSet<>();
				String sub="ces";
				sb.append(s);
				int j=0;
				int len=s.length();
				for(int i=0;i<len;i++)
				{
									
				}
			}
		
		return routine ? "YES":"NO";
	}

}
