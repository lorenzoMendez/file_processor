package calculator;

import java.io.IOException;
import java.util.List;

import constants.FileConstants;
import fileprocessor.StockFileReader;

public class RunnerCalculator <T extends Calculator> {
	
	private T calculator;
	
	private String file;
	
	public RunnerCalculator(T calculator, String file) {
		this.calculator = calculator;
		this.file = file;
	}
	
	/**
	 * This method init the execution to calculate the expected operation.
	 * @param column as the column to perform the operation.
	 * @return double as the result.
	 * @throws IOException.
	 */
	public double run(int column) throws IOException {
		StockFileReader reader = new StockFileReader(file);
		List<String> lines = reader.readFile();
		for (String line : lines) {
			String[] values = line.split(FileConstants.COMMA);
			double item = Double.parseDouble(values[column - 1]);
			calculator.addItem(item);
		}
		return calculator.calculate();
	}
}
