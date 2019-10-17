package com.ieceedtraining;

public class PyramidNumber {

	public static void main(String[] args) {
		int num = 1, rows = 5;
		System.out.println("------------46---------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num);
			}
			num++;
			System.out.println();
		}

		System.out.println("------------47-------------------");
		num = rows;
		for (int i = rows; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(num);
			}
			System.out.println("");
			num--;
		}
//Question no 48		
		System.out.println("------------48--------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(1);
			}
			System.out.println();
		}

		System.out.println("--------------49-------------------");

		for (int i = rows; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(2);
			}
			System.out.println("");
		}

	}

}
