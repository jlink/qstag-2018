package qstag;

import org.junit.jupiter.api.*;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTests {

	@Test
	void factorizingTwo() {
		assertEquals(asList(2), Primes.factorize(2));
	}
}
