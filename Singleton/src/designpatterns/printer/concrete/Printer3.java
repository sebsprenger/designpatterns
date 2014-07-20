package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer3 implements Printer {
	
	private static Printer3 instance = null;

	public static Printer3 getInstance() {
		if (instance == null) {
			instance = new Printer3();
		}
		
		return instance;
	}

	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
