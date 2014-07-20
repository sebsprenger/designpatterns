package designpatterns.factories;

import designpatterns.lighttheme.LightThemeButton;
import designpatterns.lighttheme.LightThemeScrollbar;
import designpatterns.lighttheme.LightThemeWindow;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class LightThemeFactory implements AbstractFactory {

	@Override
	public Window createWindow() {
		return new LightThemeWindow();
	}

	@Override
	public Scrollbar createScrollbar() {
		return new LightThemeScrollbar();
	}

	@Override
	public Button createButton() {
		return new LightThemeButton();
	}
}
