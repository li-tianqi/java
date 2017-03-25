package net.imwork.litianqi.java.study;

// 工厂测试类
public class FactoryTest {

	public static void main(String[] args) {
		HumanFactory factory = new HumanFactory();
		// 普通工厂
		Human male = factory.createHuman("male");
		Human female = factory.createHuman("female");
		
		// 多个工厂
		Human male2 = factory.createMale();
		Human female2 = factory.createFemale();
		
		male.eat();
		male.sleep();
		female.beat();
		
		male2.beat();
		female2.eat();
	}
}
