package com.ebox;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAndSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		boolean status=false;
		String s = sc.next();
		int n = sc.nextInt();
		String ss[] = new String[n];
		for (int i = 0; i < n; i++) {
			ss[i] = sc.next();
		}
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (map.get(key) == null) {
				map.put(key, 1);
			} else {
				int v = map.get(key);
				map.put(key, ++v);
			}
		}
		for(int i=0;i<n-1;i++) {
			Map<Character, Integer> subMap = new HashMap<>();
			String sub= ss[i]+ss[i+1];
			for (int j = 0; j < sub.length(); j++) {
				char key = sub.charAt(j);
				if (subMap.get(key) == null) {
					subMap.put(key, 1);
				} else {
					int v = subMap.get(key);
					subMap.put(key, ++v);
				}
			}
			if(map.equals(subMap))
			{
				System.out.println(ss[i]+" "+ss[i+1]);
				System.out.println("Yes");
				status=true;
				break;
			}
			
			
		}
		
		if(!status) {
			System.out.println("NO");
		}
		
		
		
	}

}
