package com.anonymous;

public class PrimeFactorization {

	public static void main(String[] args) {
		PrimeFactorization pf = new PrimeFactorization();
		System.out.println(pf.isPrime(1));
	}

	private boolean isPrime(int num) {
		int limit = (int) Math.sqrt(num);

		if (num < 2) {
			return false;
		}

		for (int i = 2; i <= limit; i++) {
			if (num % i == 0)
				return false;
		}

		return true;

	}

}
