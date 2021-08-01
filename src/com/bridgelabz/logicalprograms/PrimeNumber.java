package com.bridgelabz.logicalprograms;

public class PrimeNumber {
	static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if (isPrime(10))
			System.out.println("It is a prime Number ");

		else
			System.out.println("It is not prime Number");
	}
}