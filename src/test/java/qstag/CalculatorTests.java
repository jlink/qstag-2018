package qstag;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

	private Calculator calculator;

	@BeforeEach
	void initializeCalculator() {
		calculator = new Calculator();
	}

	@Test
	void resultIsInitiallyZero() {
		assertEquals("0.00", calculator.result());
	}

	@Test
	void addingUpNumbers() {
		calculator.add(2.00);
		assertEquals("2.00", calculator.result());

		calculator.add(42.11);
		assertEquals("44.11", calculator.result());
	}

	@Test
	void upTo6DecimalsAreShown() {
		calculator.add(0.000001);
		assertEquals("0.000001", calculator.result());

		calculator.add(0.0000001);
		assertEquals("0.000001", calculator.result());
	}

	@Test
	void displayedResultIsRoundedTo6thDecimal() {
		calculator.add(0.0000009);
		assertEquals("0.000001", calculator.result());

		calculator.add(0.0000005);
		assertEquals("0.000001", calculator.result());

		calculator.add(0.0000006);
		assertEquals("0.000002", calculator.result());
	}

	//@Test
	void addingWorksWithTwoDecimalPrecision_ForNumbersUpToQuadrillion() {
		calculator.add(10.01);
		calculator.add(1000000000000000.0);
		assertEquals("1000000000000010.01", calculator.result());
	}

}
