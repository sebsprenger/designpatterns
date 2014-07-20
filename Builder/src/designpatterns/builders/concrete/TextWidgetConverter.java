package designpatterns.builders.concrete;

import designpatterns.builders.TextConverter;
import designpatterns.types.Char;
import designpatterns.types.Font;
import designpatterns.types.TextWidget;

public class TextWidgetConverter extends TextConverter {

	@Override
	public void convertChar(Char c) {
		// convert something
	}

	@Override
	public void convertFontChange(Font f) {
		// convert something
	}

	@Override
	public void convertParagraph() {
		// convert something
	}
	
	public TextWidget getTextWidget() {
		return new TextWidget();
	}
	
}
