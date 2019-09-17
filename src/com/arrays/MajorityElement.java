package com.arrays;

import java.util.*;

public class MajorityElement {
	/*
	 * Given an array A of N elements. Find the majority element in the array. A
	 * majority element in an array A of size N is an element that appears more than
	 * N/2 times in the array.
	 * 
	 * INPUT: N = 5 , Array = 3 1 3 3 2
	 * 
	 * OUTPUT: 3
	 * 
	 * Explanation:Since, 3 is present more than N/2 times, so it is the majority
	 * element.
	 */
	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			lst.add(i);
		}
		lst.add(1);
		System.out.println(lst);
		int res = Collections.max(lst);
		Collections.rotate(lst, 2);
		System.out.println(Collections.frequency(lst, 1));
		Collections co = null;
		List<List<Integer>> arr = co.nCopies(2, lst);
		System.out.println(arr);
		System.out.println(lst);
		System.out.println(res);
	}

}
