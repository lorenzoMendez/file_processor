package calculator;

public class MaxCalculator extends Calculator {

	/**
	 * Calculate the maximum value of the given list.
	 */
	@Override
	public double calculate() {
		double max = values.get(0);
		for (double value : values) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

}
