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

	@Test
	void factorizingMixedMultiplesOf2and3() {
		assertPrimeFactors(6, asList(2, 3));
		assertPrimeFactors(108, asList(2, 2, 3, 3, 3));
	}

	@Test
	void higherPrimes() {
		assertPrimeFactors(17, asList(17));
		assertPrimeFactors(103, asList(103));
	}

	@Test
	void multipleOfAllPrimesUpTo13() {
		assertPrimeFactors(30030, asList(2, 3, 5, 7, 11, 13));
	}

	private void assertPrimeFactors(int number, List<Integer> expected) {
		assertEquals(expected, Primes.factorize(number));
	}
}
