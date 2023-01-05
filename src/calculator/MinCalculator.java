package calculator;

public class MinCalculator extends Calculator {

	/**
	 * Calculate the minimum value of the given list.
	 */
	@Override
	public double calculate() {
		double min = values.get(0);
		for (double value : values) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

}
