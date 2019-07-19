package com.ebox;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 1;
		while (n <= 100) {
			if (n % 3 == 0) {
				System.out.print("Fizz");
				if (n % 5 == 0)
					System.out.print("Buzz ");
			} else if (n % 5 == 0) {
				System.out.print("Buzz ");
			} else
				System.out.print(n);
			n++;
			System.out.println();
		}
	}

}
