package strategy.impl;

import strategy.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Voo com foguete");
	}

}
