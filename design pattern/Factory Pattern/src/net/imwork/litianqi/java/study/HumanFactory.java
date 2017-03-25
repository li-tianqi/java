package net.imwork.litianqi.java.study;

// 普通工厂类
public class HumanFactory {

	// 普通工厂方法
	public Human createHuman(String gender) {
		if(gender.equals("male")) {
			return new Male();
		} else if(gender.equals("female")) {
			return new Female();
		} else {
			System.out.println("Please input correct gender!");
			return null;
		}
	}
	
	// 多个工厂方法
	public Male createMale() {
		return new Male();
	}
	public Female createFemale() {
		return new Female();
	}
	
	// 还可以静态工厂方法，即将多个工厂方法定义为静态方法，不用实例化工厂类，即可直接直接调用
}
