package com.anonymous;

import java.util.Arrays;

public class StringQUestions {
	public static void main(String[] args) {
		String q = "what is JVM?=a,b,c,d,a-what is avm?=a,b,c,d,b-what is lol?=a,b,c,d,a";
		String[] questions = q.split("-");
		System.out.println(Arrays.toString(questions));
		for(String s : questions) {
			//System.out.println(Arrays.toString(s);
			System.out.println(s.split("=")[1].split(",")[4]);
		}
	}
}
