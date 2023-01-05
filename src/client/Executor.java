package client;

import java.io.IOException;

import calculator.MaxCalculator;
import calculator.RunnerCalculator;
import constants.FileConstants;

public class Executor {
	
	public static void main(String[] args) throws IOException {
		MaxCalculator calculator = new MaxCalculator();
		RunnerCalculator<MaxCalculator> runner = new RunnerCalculator<MaxCalculator>(calculator, FileConstants.FILE_NAME);
		double result = runner.run(1);
		System.out.println(result);
	}
}
