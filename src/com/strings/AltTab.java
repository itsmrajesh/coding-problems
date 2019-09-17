package com.strings;
import java.util.*;
import java.util.Arrays;

public class AltTab {
	/*Implement the ALT TAB program*/
	public static void main(String[] args) {
		
		int n = 4;
		int tabs = 3;
		int arr[] = {1,2,3,4};
		int res [] =  gettabs(n,tabs,arr);
		System.out.println(Arrays.toString(res));

	}

	private static int[] gettabs(int n, int tabs, int[] arr) {
		
		int a = arr[0];
		int b= arr[tabs-1];
		int c=0;
		List<Integer> list = new ArrayList<>();
		for(int ele : arr) {
			if(c != tabs-1) {
				list.add(ele);
			}
			c++;
		}
		list.add(0,b);
		c=0;
		int newArr[] = new int[n];
		for(int j : list) {
			newArr[c++]= j;
		}
		return newArr;
		
		 
	}

}
