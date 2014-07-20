package designpatterns.adapter;

import designpatterns.adaptee.WuTangPlugin;
import designpatterns.target.Plugin;

public class WuTangPluginObjectAdapter implements Plugin {

	private WuTangPlugin plugin;
	
	public WuTangPluginObjectAdapter(WuTangPlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void run() {
		plugin.doSomething();
	}

	@Override
	public int getSize() {
		int sizeInKb = plugin.getSize();
		int sizeInMb = sizeInKb / 1024;
		return sizeInMb;
	}

}
