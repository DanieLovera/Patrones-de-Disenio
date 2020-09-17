package ObserverPattern.Model;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList;
    private float humidity;
    private float pressure;
    private float temperature;

    public  WeatherData () {
        this (new ArrayList<>(), 0,0,0);
    }

    public WeatherData (List<Observer> observerList) {
        this (observerList, 0,0,0);
    }

    public WeatherData (List<Observer> observerList, float humidity
            , float pressure, float temperature) {
        this.observerList = observerList;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer actualObserver : observerList) {
            actualObserver.update(humidity,pressure,temperature);
        }
    }

    public void setMeasurements(float humidity, float pressure, float temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
