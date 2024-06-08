package Chapter7;

public class YellowLightState implements Traffickightstate {

	@Override
	public void changeState(TrafficLightContext context) {
		// TODO Auto-generated method stub
		System.out.println("yellolight caution:");
		
		context.setState(new RedLightState());
		
	}

}
