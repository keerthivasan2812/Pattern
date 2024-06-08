package Chapter2;

public class CurrentConditionalElement implements Observer ,DisplayElement {

	private float temperature;
	private float pressure;
	private float humidity;
	private WetherData wether;
	
	
	public CurrentConditionalElement(WetherData wether) {
		this.wether=wether;
		wether.registerObserver(this);
		
	}
	
	
	

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
		this.temperature=temp;
		this.pressure=pressure;
		this.humidity=humidity;
		display();
	}
	 @Override
	    public void display() {
	        System.out.println("Current conditions: " +
	            "temperature = " + temperature +
	            ", humidity = " + humidity +
	            ", pressure = " + pressure);
	    }

}
