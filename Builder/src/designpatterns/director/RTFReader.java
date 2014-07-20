package designpatterns.director;

import designpatterns.builders.TextConverter;
import designpatterns.types.RTFDocument;

public class RTFReader {
	private TextConverter textConverter = null;
	
	public RTFReader(TextConverter textConverter) {
		this.textConverter = textConverter;
	}
	
	public void parseDocument(RTFDocument document) {
		textConverter.convertChar(document.getChar());
		textConverter.convertFontChange(document.getFontChange());
		textConverter.convertParagraph();
	}
}
