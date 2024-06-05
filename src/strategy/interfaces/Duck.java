package strategy.interfaces;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}
	
	public void setFlyBehavior(FlyBehavior behavior) {
		this.flyBehavior = behavior;
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("Todos os patos nadam");
	}
}
