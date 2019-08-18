package com.anonymous;

public class Accumul {

	public static void main(String[] args) {
		String s = "abcde";
		String res = accum(s);
		System.out.println(s);
		System.out.println(res);
	}

	private static String accum(String s) {
		s=s.toLowerCase();
		int count =1, len =  s.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<len;i++) {
			sb.append(String.valueOf(s.charAt(i)).toUpperCase());
			for(int j=1;j<count;j++) {
				sb.append(""+s.charAt(i));
			}
			count++;
			sb.append("-");
		}
		
		return sb.toString().substring(0, sb.length()-1);
	}

}
