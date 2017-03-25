package net.imwork.litianqi.java.study;

// 加上金发
public class GoldenHair extends GirlDecorator {

	private Girl girl;
	public GoldenHair(Girl g) {
		girl = g;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDescription() + "+with golden hair";
	}

}
