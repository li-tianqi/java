package net.imwork.litianqi.java.study;

// 主题接口
public interface Subject {

	// 观察者注册
	public void registerObserver(Observer o);
	// 观察者移除
	public void removeObserver(Observer o);
	// 通知所有观察者
	public void notifyAllObservers();
}
