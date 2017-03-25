package net.imwork.litianqi.java.study;

// 吃货
public class Foodaholic {

	public void eat(KitchenFactory k) {
		System.out.println("A foodaholic is eating " 
				+ k.getFood().getFoodName() + " with " 
				+ k.getTableWare().getToolName() + "!");
	}
	
	public static void main(String[] args) {
		Foodaholic fat = new Foodaholic();
		KitchenFactory kf = new AKitchen();
		fat.eat(kf);
	}
	// 类似的，还可以创造厨房B，生产牛奶和杯子给吃货
}
