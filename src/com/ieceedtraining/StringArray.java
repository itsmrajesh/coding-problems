package com.ieceedtraining;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		//Input is from command line arguments
		String city = args[args.length - 1];
		System.out.println("Given array is " + Arrays.toString(args));
		System.out.println(isFound(args, city));
	}

	private static String isFound(String[] args, String city) {
		for (String s : args) {
			if (s.equals(city)) {
				return city + " City found in a given array";
			}
		}
		return city + "City Not found in a given array";
	}

}
