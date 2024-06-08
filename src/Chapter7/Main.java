package Chapter7;

public class Main {
	public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        for (int i = 0; i < 6; i++) {
            context.changeState();
        }
	}

}
