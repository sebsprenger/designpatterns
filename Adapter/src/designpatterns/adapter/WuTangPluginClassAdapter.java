package designpatterns.adapter;

import designpatterns.adaptee.WuTangPlugin;
import designpatterns.target.Plugin;

public class WuTangPluginClassAdapter extends WuTangPlugin implements Plugin {

	@Override
	public void run() {
		doSomething();
	}
	
	@Override
	public int getSize() {
		return super.getSize() / 1024;
	}

}