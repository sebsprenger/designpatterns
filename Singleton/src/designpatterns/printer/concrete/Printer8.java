package designpatterns.printer.concrete;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Printer8 implements Printer {
	
	private static Object lockObject = new Object();
	private static volatile Printer8 instance = null;

	public static Printer8 getInstance() {
		Printer8 local = instance;
		if (local == null) {
			synchronized (lockObject) {
				local = instance;
				if (local == null) {
					local = instance = new Printer8();
				}
			}
		}
		
		return local;
	}
	
	public void setInstance(Printer8 printer) {
		instance = printer;
	}
	
	@Override
	public void print(Document doc) {
		// ... print
	}
	
}
