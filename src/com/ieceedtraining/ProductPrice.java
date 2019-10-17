package com.ieceedtraining;

public class ProductPrice {

	public static void main(String[] args) {
		String s1 = args[0];
		double p1 = Double.parseDouble(args[1]);
		String s2 = args[2];
		double p2 = Double.parseDouble(args[3]);
		System.out.print("highest product price is : ");
		if (p1 > p2) {
			System.out.println("product name : " + s1 + ", price " + p1);
		} else {
			System.out.println("product name : " + s2 + ", price " + p2);
		}

	}

}
