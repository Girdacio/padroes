package strategy;

import strategy.domain.MallardDuck;
import strategy.domain.ModelDuck;
import strategy.impl.FlyRocketPowered;
import strategy.interfaces.Duck;

public class MiniDucksSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("\n\t***\t***\t***\n");
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
