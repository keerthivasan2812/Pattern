 package org.chapter1;

public abstract class Duck {
	
	FlyingBehaviour flyd;
	QuackingBehaviour qb;
	
	public abstract void display();
	
	
	public void performfly() {
		flyd.fly();
		
	}
	
	public void performQuack() {
		qb.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	public void setFlyBehavior(FlyingBehaviour fb) {
		flyd = fb;
		}
		public void setQuackBehavior(QuackingBehaviour qb1) {
			qb = qb1;
		}

}
	
	
