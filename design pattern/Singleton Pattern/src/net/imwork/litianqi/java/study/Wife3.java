package net.imwork.litianqi.java.study;

// 双重检验锁
public class Wife3 {

	// 一开始没有建立新实例
	private volatile static Wife3 wife;
	// 这里volatile关键字作用是防止编译器自动优化代码
	
	private Wife3() {}
	
	// 双重锁的getWife()方法
	public static Wife3 getWife() {
		// 第一个检验锁，如果不为空直接返回实例对象，为空才进入下一步
		if(wife == null) {
			synchronized (Wife3.class) {
				// 第二个检验锁，因为可能有多个线程进入到if语句内
				if(wife == null){
					wife = new Wife3();
				}
			}
		}
		return wife;
	}
}
