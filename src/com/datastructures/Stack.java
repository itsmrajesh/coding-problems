package com.datastructures;

import java.util.*;

public class Stack {
	int top = -1;
	int size = 20;
	private List<String> list = new ArrayList<>();

	public void push(String element) {
		if (top < size-1) {
			top++;
			list.add(top, element);
		} else {
			System.out.println("Stack Over Flow");
		}
	}

	public String pop() {
		if (list.isEmpty() && top > 0) {
			return "Stack Under Flow";
		} else {
			String ele = list.remove(top);
			top--;
			return ele;
		}

	}
	
	public void display() {
		for(String e : list) {
			System.out.println(e);
		}
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
