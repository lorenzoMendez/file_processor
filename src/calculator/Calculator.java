package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
	
	protected List<Double> values;
	
	public Calculator() {
		this.values = new ArrayList<>();
	}
	
	public Calculator(List<Double> values) {
		this.values = values;
	}
	
	/**
	 * Add an item to the list.
	 * @param item as the item to add.
	 */
	public void addItem(Double item) {
		this.values.add(item);
	}
	
	/**
	 * This method is to perform the operation desired.
	 * @return double as the result.
	 */
	public abstract double calculate();
}
