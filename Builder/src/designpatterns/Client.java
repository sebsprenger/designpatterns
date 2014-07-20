package designpatterns;

import designpatterns.builders.concrete.ASCIIConverter;
import designpatterns.director.RTFReader;
import designpatterns.types.ASCIIText;
import designpatterns.types.RTFDocument;

public class Client {

	@SuppressWarnings("unused")
	public void doSomething() {
		ASCIIConverter converter = new ASCIIConverter(); // builder
		RTFReader reader = new RTFReader(converter); // director
		
		RTFDocument document = new RTFDocument();
		
		reader.parseDocument(document);
		ASCIIText text = converter.getASCIIText();
	}
	
}
