package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer1 implements Printer {
	
	public static final Printer1 INSTANCE = new Printer1();

	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
