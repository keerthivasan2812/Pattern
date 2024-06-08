package Chapter7;

public class RedLightState implements Traffickightstate{

	@Override
	public void changeState(TrafficLightContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("red light: stop");
		context.setState(new GreenLightState());
		
	}

}
