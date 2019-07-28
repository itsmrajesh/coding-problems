package com.tcs;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 9, 8, 5, 4, 6, 4, 3, 99, 11 };	
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i : arr) {
			ts.add(i);
		}
		Object[] arr2 = ts.toArray();
		System.out.println("Second largest in given array : "+arr2[ts.size()-2]);

	}

}
