package net.imwork.litianqi.java.study;

// 懒汉模式(线程安全需加上synchronized关键字)
public class Wife2 {

	// 一开始没有建立新实例
	private static Wife2 wife;
	
	private Wife2() {}
	
	// 需要时再新建
	public static synchronized Wife2 getWife() {
		if(wife == null) {
			wife = new Wife2();
		}
		return wife;
	}
}
