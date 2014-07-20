package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public enum Printer7 implements Printer {
	INSTANCE;
	
	@Override
	public void print(Document doc) {
		// ... print
	}

}
