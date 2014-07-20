package designpatterns.builders.concrete;

import designpatterns.builders.TextConverter;
import designpatterns.types.ASCIIText;
import designpatterns.types.Char;

public class ASCIIConverter extends TextConverter {

	@Override
	public void convertChar(Char c) {
		// convert something
	}

	public ASCIIText getASCIIText() {
		return new ASCIIText();
	}
	
}
