package designpatterns.factories;

import designpatterns.darktheme.DarkThemeButton;
import designpatterns.darktheme.DarkThemeScrollbar;
import designpatterns.darktheme.DarkThemeWindow;
import designpatterns.windowelements.Button;
import designpatterns.windowelements.Scrollbar;
import designpatterns.windowelements.Window;

public class DarkThemeFactory implements AbstractFactory {

	@Override
	public Window createWindow() {
		return new DarkThemeWindow();
	}

	@Override
	public Scrollbar createScrollbar() {
		return new DarkThemeScrollbar();
	}

	@Override
	public Button createButton() {
		return new DarkThemeButton();
	}
}
