package net.imwork.litianqi.java.study;

// 适配器测试
public class AdapterTest {

	public static void main(String[] args) {
		EnPluginInterface enPlugin = new EnPlugin();
		Home home = new Home();
		PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);
		home.setPlugin(pluginAdapter);
		home.charge();
	}
}
