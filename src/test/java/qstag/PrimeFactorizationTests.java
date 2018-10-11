package qstag;

import java.util.*;

import org.junit.jupiter.api.*;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTests {

	@Test
	void factorizingMultiplesOf2() {
		assertPrimeFactors(2, asList(2));
		assertPrimeFactors(4, asList(2, 2));
		assertPrimeFactors(16, asList(2, 2, 2, 2));
	}

	@Test
	void factorizingMultiplesOf3() {
		assertPrimeFactors(3, asList(3));
		assertPrimeFactors(27, asList(3, 3, 3));
	}


	private void assertPrimeFactors(int number, List<Integer> expected) {
		assertEquals(expected, Primes.factorize(number));
	}
}
