package com.strings;

/*reverse the given string ex :-String s =  i.like.this.program.very.much  expected output :- much.very.program.this.like.i */
/*Note : separator is '.' in input string */

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		doReverse(s);
	}

	private static void doReverse(String s) {
		StringBuffer sb = new StringBuffer();
		s = s.replace(".", " ");
		String arr[] = s.split(" ");
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			if (i != 0) {
				sb.append(arr[i] + ".");
			} else {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
	}

}
