package com.strings;
import java.util.*;

public class YearDifference {
	/*FInd the difference between years in the given string */
	public static void main(String[] args) {
		String s = "my date birth is 24-10-1998 and current date is  15-08-2019";
		int res = getMax(s);
		System.out.println(res);
	}

	private static int getMax(String s) {
		
		String arr[] = s.split(" ");
		int c = 0, res = 0;
		int temp[] = new int[2];
		for (String ele : arr) {
			if (ele.contains("-")) {
				temp[c++] = Integer.parseInt(ele.substring(6, 10));
			}
		}
		res =  temp[0]-temp[1];
		if(res==0)
			return 1;
		return Math.abs(res);
		
	
	}

}
