package BehaviourlPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Observer interface 
interface Observer {
	void update(float temp);
}

// Subject Interface
interface Subject {
	void attach(Observer obs);
	void detach(Observer obs);
	void notifyObservers();
}

class WeatherStation implements Subject{
	
	private float temperature;
	
	private List<Observer> observerList;
	
	WeatherStation(){
		observerList = new ArrayList<>();
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
	
	@Override
	public void attach(Observer obs) {
		observerList.add(obs);	
	}

	@Override
	public void detach(Observer obs) {
		observerList.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs: observerList) {
			obs.update(temperature);
		}		
	}
}

class DisplayDevice implements Observer{
	@Override
	public void update(float temp) {
		// TODO Auto-generated method stub
		System.out.println("Temp on display is "+ temp);
	}
}

class MobileDevice implements Observer{
	@Override
	public void update(float temp) {
		// TODO Auto-generated method stub
		System.out.println("Temp on mobile is "+ temp);	
	}
}


public class ObserverPatternExample {
	
	public static void main(String args[]) {
		//Create a Publisher
		WeatherStation weatherStation = new WeatherStation();
		
		//Create subscribers
		DisplayDevice device = new DisplayDevice();
		MobileDevice moblieDevice = new MobileDevice();
		
		weatherStation.attach(device);
		weatherStation.attach(moblieDevice);
		weatherStation.setTemperature(25);
		weatherStation.setTemperature(55);
	}
}
