package Chapter2;

public class WeatherDataStation {
	
	public static void main(String[] args) {
		WetherData wd=new WetherData();
		
		CurrentConditionalElement cce=new CurrentConditionalElement(wd);
		
		
		wd.Setmeasurement(80, 65, 30.4f);
		
	}

}
