package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer4 implements Printer {
	
	private static Printer4 instance = null;

	public static synchronized Printer4 getInstance() {
		if (instance == null) {
			instance = new Printer4();
		}
		
		return instance;
	}

	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
