package ObserverPattern.Model;

public class TestObserverPattern {

    public static void main (String args[]) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,2,30.4f);
    }
}
