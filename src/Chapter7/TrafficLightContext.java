package Chapter7;

public class TrafficLightContext {
	
	private Traffickightstate currentstate;

	
	public TrafficLightContext() {
		this.currentstate=new RedLightState();
	}
	
	public void setState(Traffickightstate state) {
		
		this.currentstate=state;
		
	}
	
	public void changeState() {
		currentstate.changeState(this);
	}
	
}
