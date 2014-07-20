package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer6 implements Printer {
	
	private static Object lockObject = new Object();
	private static volatile Printer6 instance = null;

	public static Printer6 getInstance() {
		Printer6 local = instance;
		if (local == null) {
			synchronized (lockObject) {
				local = instance;
				if (local == null) {
					local = instance = new Printer6();
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
