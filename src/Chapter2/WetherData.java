package Chapter2;

import java.util.ArrayList;
import java.util.List;

public class WetherData implements Subject {
	
	private List<Observer> observers;
	
	private float temperature;
	
	private float humidity;
	private float pressure;
	
	
	public WetherData() {
		observers= new ArrayList<Observer>();
	}
	
	
public void removeObserver(Observer o) {
		
		observers.remove(o);
		
	}

@Override
public void registerObserver(Observer o) {
	// TODO Auto-generated method stub
	observers.add(o);
}

@Override
public void notifyObserver() {
	// TODO Auto-generated method stub
	
	for(Observer observer:observers) {
		observer.update(temperature, humidity, pressure);
	}
	
}
public void measurementChanged() {
	notifyObserver();
	
}
public void Setmeasurement(float temp,float humidity,float pressure) {
	this.temperature=temp;
	this.humidity=humidity;
	this.pressure=pressure;
	measurementChanged();
}
//Optional getters for encapsulation
public float getTemperature() {
    return temperature;
}

public float getHumidity() {
    return humidity;
}

public float getPressure() {
    return pressure;
}

}
