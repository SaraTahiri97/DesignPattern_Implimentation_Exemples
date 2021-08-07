package weatherStationPackage;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	public CurrentConditionsDisplay(Subject weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
	}
	//this update methde is overriden from the Observer Interface it has all the three parameters
	// because it's used by all observers 
	// in this observer: temperature, humidity exists but the pressure isn't
	public void update(float temperature, float humidity, float pressure) {
	this.temperature = temperature;
	this.humidity = humidity;
	display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
	}
