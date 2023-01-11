package client;

import java.io.IOException;

import calculator.MaxCalculator;
import calculator.RunnerCalculator;
import constants.FileConstants;
import constants.Season;

public class Executor {
	
	public static void main(String[] args) throws IOException {
		MaxCalculator calculator = new MaxCalculator();
		RunnerCalculator<MaxCalculator> runner = new RunnerCalculator<MaxCalculator>(calculator, FileConstants.FILE_NAME);
		double result = runner.run(1);
		System.out.println(result);
		testEnums();
	}
	
	public static void testEnums() {
		for (Season season : Season.values()) {
			System.out.println(season.name() + " - " + season.ordinal());
		}
		Season test = Season.valueOf("SUMMER");
		System.out.println(test.name());
		
		Season season = Season.SUMMER;
		Season season2 = Season.SUMMER;
		switch(season) {
			case WINTER:
				System.out.println("WINTER station");
				break;
			case SUMMER:
				season.printExpectedVisitors();
				season2.printExpectedVisitors();
				break;
			default:
				System.out.println("Default station");
		}
	}
}
