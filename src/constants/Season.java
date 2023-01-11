package constants;

public enum Season {
	
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);
	
	private final int expectedVisitors;
	
	private Season(int expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
		System.out.println("Calling constructor... " + this.expectedVisitors);
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
