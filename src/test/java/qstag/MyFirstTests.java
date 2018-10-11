package qstag;

import org.junit.jupiter.api.*;

class MyFirstTests {

	@Test
	void additionInJavaWorks() {
		int sum = 5 + 6;
		Assertions.assertEquals(11, sum);
	}

	// Delete before Demo:
	@Test
	void floatAdditionInJava() {
		double sum = 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		sum = sum + 0.1;
		Assertions.assertEquals(1.0, sum, 0.01);
	}

}
