package qstag;

import java.util.*;

public class Primes {
	public static List<Integer> factorize(int number) {
		List<Integer> factors = new ArrayList<>();
		int prime = 2;
		if (number % 3 == 0) {
			prime = 3;
		}
		while (number % prime == 0) {
			factors.add(prime);
			number = number / prime;
		}
		return factors;
	}
}
