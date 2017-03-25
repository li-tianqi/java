package net.imwork.litianqi.java.study;

// 饿汉模式
public class Wife1 {

	// 一开始就新建一个实例
	private static final Wife1 wife = new Wife1();
	
	// 默认构造方法
	private Wife1() {}
	
	// 获得实例的方法
	public static Wife1 getWife() {
		return wife;
	}
}
