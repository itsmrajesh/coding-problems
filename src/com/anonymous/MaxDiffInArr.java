package com.anonymous;

public class MaxDiffInArr {

	public static void main(String[] args) {
		String s = "1,2,4,5,6,8";
		int res = getMaxDiff(s);
	}

	private static int getMaxDiff(String s) {
		int len = s.length(), c = 0;
		int arr[] = new int[len];
		for (String num : s.split(",")) {
			arr[c++] = Integer.parseInt(num);
		}
		for(int i=0;i<len;i++) {
			for(int j=0;j<i;j++) {
				
			}
		}
		return 0;
	}

}
