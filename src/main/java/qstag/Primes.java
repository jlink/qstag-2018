package qstag;

import java.util.*;

public class Primes {
	public static List<Integer> factorize(int number) {
		List<Integer> factors = new ArrayList<>();
		for (int prime = 2; prime <= 3; prime++) {
			while (number % prime == 0) {
				factors.add(prime);
				number = number / prime;
			}
		}
		return factors;
	}
}
