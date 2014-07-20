package designpatterns.client;

import designpatterns.adaptee.WuTangPlugin;
import designpatterns.adapter.WuTangPluginClassAdapter;
import designpatterns.adapter.WuTangPluginObjectAdapter;
import designpatterns.target.Framework;

public class Main {

	public static void main(String[] args) {

		Framework fw = new Framework();
		
		fw.runPlugin(new WuTangPluginObjectAdapter(new WuTangPlugin()));
		fw.runPlugin(new WuTangPluginClassAdapter());
	}

}
