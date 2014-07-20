package designpatterns.client;

import designpatterns.printer.concrete.Printer6;
import designpatterns.types.Document;

public class Client2 {
	
	public void dependencyInMethod() {
		Document doc = new Document();
		Printer6.getInstance().print(doc);
	}
	
}
