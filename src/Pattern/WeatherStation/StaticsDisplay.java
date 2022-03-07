package Pattern.WeatherStation;

import Pattern.WeatherStation.Service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StaticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int countTemp;
    private Observable observable;

    public StaticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / countTemp) +
                "/" + maxTemp + "/" + minTemp);

    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        if (o instanceof WeatherData) {
            tempSum += weatherData.getTemperature();
            countTemp++;
            if (weatherData.getTemperature() > maxTemp) {
                maxTemp = weatherData.getTemperature();
            }
            if (weatherData.getTemperature() < minTemp) {
                minTemp = weatherData.getTemperature();
            }
            display();
        }
    }
}
