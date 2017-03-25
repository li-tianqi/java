package net.imwork.litianqi.java.study;

import java.util.ArrayList;

// 视频网站 实现subject接口
public class VideoSite implements Subject {

	// 观察者列表及更新的视频列表
	private ArrayList<Observer> userList;
	private ArrayList<String> videos;
	
	public VideoSite() {
		userList = new ArrayList<Observer>();
		videos = new ArrayList<String>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub

		userList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub

		userList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub

		for(Observer o: userList) {
			o.update(this);
		}
	}

	public void addVideos(String video) {
		this.videos.add(video);
		notifyAllObservers();	// 每次更新视频要通知所有观察者
	}
	
	public ArrayList<String> getVideos() {
		return videos;
	}
	
	public String toString() {
		return videos.toString();	// toString返回对象在内存中的引用信息？
	}
	// 类的toString（）方法默认为返回对象在内存中的引用信息
	// 此处重写toString(),使其实现List的对应方法
	// 没有此函数，最终将返回地址信息
}
