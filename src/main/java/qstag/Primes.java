package qstag;

import java.util.*;

public class Primes {
	public static List<Integer> factorize(int number) {
		List<Integer> factors = new ArrayList<>();
		for (int prime = 2; prime <= number; prime++) {
			while (isDivisibleBy(number, prime)) {
				factors.add(prime);
				number = number / prime;
			}
		}
		return factors;
	}

	private static boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}
}
