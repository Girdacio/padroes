package strategy.domain;

import strategy.impl.FlyNoWay;
import strategy.impl.Quack;
import strategy.interfaces.Duck;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("Sou um model duck");
	}

}
