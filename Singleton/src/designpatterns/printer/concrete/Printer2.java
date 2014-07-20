package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer2 implements Printer {
	
	private static Printer2 instance = new Printer2();

	public static Printer2 getInstance() {
		return instance;
	}

	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
