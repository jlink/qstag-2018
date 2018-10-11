package qstag;

import java.text.*;

public class Calculator {

	final static DecimalFormat decimalFormat = new DecimalFormat("0.00####");

	private double result = 0.0;

	public String result() {
		return decimalFormat.format(result);
	}

	public void add(double addend) {
		result += addend;
	}
}
