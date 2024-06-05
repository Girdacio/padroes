package strategy.domain;

import strategy.impl.FlyWithWings;
import strategy.impl.Quack;
import strategy.interfaces.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Sou um Mallard Duck");		
	}
	
}
