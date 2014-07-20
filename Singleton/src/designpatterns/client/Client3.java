package designpatterns.client;

import designpatterns.printer.Printer;
import designpatterns.types.Document;

public class Client3 {
	private Printer printer = null;
	
	public Client3(Printer printer) {
		this.printer = printer;
	}
	
	public void deferDependencyToClass() {
		Document doc = new Document();
		printer.print(doc);
	}
}
