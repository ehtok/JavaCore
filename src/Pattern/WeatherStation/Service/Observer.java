package Pattern.WeatherStation.Service;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
