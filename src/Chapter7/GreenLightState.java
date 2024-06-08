package Chapter7;

public class GreenLightState implements Traffickightstate {

	@Override
	public void changeState(TrafficLightContext context) {
		// TODO Auto-generated method stub
		System.out.println("green light: go");
		
		context.setState(new YellowLightState());
		
	}

}
