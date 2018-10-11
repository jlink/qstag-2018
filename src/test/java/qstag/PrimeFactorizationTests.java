package qstag;

import java.util.*;

import org.junit.jupiter.api.*;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTests {

	@Test
	void factorizingTwo() {
		assertPrimeFactors(2, asList(2));
	}

	@Test
	void factorizingFour() {
		assertPrimeFactors(4, asList(2, 2));
	}

	private void assertPrimeFactors(int number, List<Integer> expected) {
		assertEquals(expected, Primes.factorize(number));
	}
}
