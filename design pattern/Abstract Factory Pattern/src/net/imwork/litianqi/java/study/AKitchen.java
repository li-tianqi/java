package net.imwork.litianqi.java.study;

// 具体工厂AKitchen
public class AKitchen implements KitchenFactory {

	@Override
	public Food getFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public TableWare getTableWare() {
		// TODO Auto-generated method stub
		return new Knife();
	}

}
