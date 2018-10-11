package qstag;

import java.util.*;

public class Primes {
	public static List<Integer> factorize(int number) {
		List<Integer> factors = new ArrayList<>();
		while (number % 2 == 0) {
			factors.add(2);
			number = number / 2;
		}
		return factors;
	}
}
