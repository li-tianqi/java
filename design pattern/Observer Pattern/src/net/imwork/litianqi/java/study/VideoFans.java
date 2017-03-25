package net.imwork.litianqi.java.study;

// 实现观察者（fans）
public class VideoFans implements Observer {

	private String name;
	
	public VideoFans(String name) {
		this.name = name;
	}
	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub

		System.out.println(this.name + ", new videos are available!");
		// print video list(所有可用列表)
		System.out.println(s);
	}

}
