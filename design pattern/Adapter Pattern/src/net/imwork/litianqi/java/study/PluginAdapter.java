package net.imwork.litianqi.java.study;

// 适配器
public class PluginAdapter implements CnPluginInterface {

	private EnPluginInterface enPlugin;
	public PluginAdapter(EnPluginInterface enPlugin) {	// 输入为英标
		this.enPlugin = enPlugin;
	}
	
	// 适配器实现英标插头，然后重载国标充电方法为英标方法
	@Override
	public void chargeWith2Pins() {
		// TODO Auto-generated method stub

		enPlugin.chargeWith3Pins();
	}

}
