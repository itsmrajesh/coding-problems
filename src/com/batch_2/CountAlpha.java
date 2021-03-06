package com.batch_2;

public class CountAlpha {

	public static void main(String[] args) {
		String str = "I am in Bangalore my house number is 6 and my phone no. 9632133889";
		char[] arr = str.toLowerCase().toCharArray();
		int count[] = getMyCount(arr);
		System.out.println("Alphabets Count : " + count[0]);
		System.out.println("Numbers Count : " + count[1]);
		System.out.println("Space Count : " + count[2]);
	}

	private static int[] getMyCount(char[] arr) {
		int alphaCount = 0, numberCount = 0, spaceCount = 0;

		for (char ch : arr) {
			if (ch >= 'a' && ch <= 'z')
				alphaCount++;
			else if (ch >= '0' && ch <= '9') // check for number
				numberCount++;
			else if (ch == ' ') // check for space
				spaceCount++;
		}

		return new int[] { alphaCount, numberCount, spaceCount };
	}

}
