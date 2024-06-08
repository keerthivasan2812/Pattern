package Chapter3;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beaverages bevarage) {
		this.bevarages=bevarage;
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return bevarages.getDescription() + "Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return bevarages.cost() +20;
	}

}
