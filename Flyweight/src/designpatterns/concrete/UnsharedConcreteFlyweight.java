package designpatterns.concrete;

import designpatterns.flyweight.Flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {

	private int startRow;
	private int startColumn;

	public UnsharedConcreteFlyweight(int startRow, int startColumn) {
		this.startRow = startRow;
		this.startColumn = startColumn;
	}

	@Override
	public String getOutput(String before, String after) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < startRow; i++) {
			builder.append(System.lineSeparator());
		}

		for (int i = 0; i < startColumn; i++) {
			builder.append(" ");
		}
		
		return builder.toString();
	}

}
