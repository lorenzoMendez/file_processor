package calculator;

public class MeanCalculator extends Calculator {

	/**
	 * Calculate the mean of the given list.
	 */
	@Override
	public double calculate() {
		double accumulator = 0.0;
		for (double value : values) {
			accumulator += value;
		}
		return accumulator / values.size();
	}

}
