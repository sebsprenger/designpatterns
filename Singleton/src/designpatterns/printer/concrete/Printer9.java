package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer9 implements Printer {
	
	private static Object lockObject = new Object();
	protected static volatile Printer9 instance = null;

	public static Printer9 getInstance() {
		Printer9 local = instance;
		if (local == null) {
			synchronized (lockObject) {
				local = instance;
				if (local == null) {
					local = instance = new Printer9();
				}
			}
		}
		
		return local;
	}
	
	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
