package designpatterns.client;

import designpatterns.printer.Printer;
import designpatterns.printer.concrete.Printer6;
import designpatterns.types.Document;

public class Client4 {
	private Printer printer = Printer6.getInstance();
	
	public Client4() {
		// default production code
	}
	
	public Client4(Printer printer) {
		this.printer = printer;
	}
	
	public void deferDependencyToClass() {
		Document doc = new Document();
		printer.print(doc);
	}
}
