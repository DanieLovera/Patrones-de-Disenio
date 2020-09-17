package ObserverPattern.Model;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float humidity;
    private float pressure;
    private float temperature;

    public CurrentConditionDisplay (Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float humidity, float pressure, float temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: \n\t- " + humidity + "% humidity \n\t- "
        + pressure + " atm pressure \n\t- " + temperature + " F temperature.");
    }
}
