package com.leetcode;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no of elements in array
		String arr[] = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		getGroupedAnagrams(arr);
	}

	private static void getGroupedAnagrams(String[] arr) {
		int len = arr.length;
		Map<String,List<String>> map= new HashMap<>();
		
		for(String s:arr) {
			String key=getSorted(s);
			if(map.containsKey(key)) {
				List<String> lst=map.get(key);
				lst.add(s);
				map.put(key, lst);
			}
			else {
				List<String> list=new ArrayList<>();
				list.add(s);
				map.put(key, list);
			}
		}
		Collection<List<String>> lists = map.values();
		for(List<String> list:lists) {
			System.out.println(list);
		}
		
	}
	
	private static String getSorted(String s) {
		char ss[]=s.toCharArray();
		Arrays.sort(ss);
		return String.valueOf(ss);
	}

}
