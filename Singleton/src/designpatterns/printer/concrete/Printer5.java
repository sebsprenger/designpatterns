package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer5 implements Printer {
	
	private static Object lockObject = new Object();
	private static volatile Printer5 instance = null;

	public static Printer5 getInstance() {
		if (instance == null) {
			synchronized (lockObject) {
				if (instance == null) {
					instance = new Printer5();
				}
			}
		}
		
		return instance;
	}

	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
