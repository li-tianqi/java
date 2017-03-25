package net.imwork.litianqi.java.study;

// 加上身材高
public class Tall extends GirlDecorator {

	private Girl girl;
	public Tall(Girl g) {
		girl = g;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDescription() + "+is very tall";
	}

}
