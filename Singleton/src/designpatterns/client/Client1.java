package designpatterns.client;

import designpatterns.printer.concrete.Printer1;
import designpatterns.printer.concrete.Printer2;
import designpatterns.printer.concrete.Printer3;
import designpatterns.printer.concrete.Printer4;
import designpatterns.printer.concrete.Printer5;
import designpatterns.printer.concrete.Printer6;
import designpatterns.printer.concrete.Printer7;
import designpatterns.types.Document;

public class Client1 {

	public static void useSingleton() {
		
		Document doc = new Document();
		
		Printer1.INSTANCE.print(doc);
		
		Printer2.getInstance().print(doc);
		Printer3.getInstance().print(doc);
		Printer4.getInstance().print(doc);
		Printer5.getInstance().print(doc);
		Printer6.getInstance().print(doc);
		
		Printer7.INSTANCE.print(doc);
		
	}

}
