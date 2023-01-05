package fileprocessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockFileReader {
	
	private String file = null;
	
	public StockFileReader(String file) {
		this.file = file;
	}
	
	/**
	 * Method to read each row of the file as a string.
	 * @return a list of strings.
	 * @throws IOException.
	 */
	public List<String> readFile() throws IOException {
		List<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
			reader.readLine();
			String line = null;
			while((line = reader.readLine()) != null) {
				lines.add(line);
			}
		}
		return lines;
	}

}
