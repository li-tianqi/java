package net.imwork.litianqi.java.study;

// 测试
public class Main {

	public static void main(String[] args) {
		VideoSite vs = new VideoSite();
		vs.registerObserver(new VideoFans("LiLei"));
		vs.registerObserver(new VideoFans("HanMeimei"));
		vs.registerObserver(new VideoFans("XiaoHua"));
		// 加 video
		vs.addVideos("Video 1");
		vs.addVideos("Video 2");
		vs.addVideos("Video 3");
		
		//System.out.println("videos = " + vs.getVideos());
	}
}
