package Pattern5;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private String weatherUpdate;

    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void setWeatherUpdate(String newWeatherUpdate){
        this.weatherUpdate = newWeatherUpdate;
        notifyObservers();
    }

    private void notifyObservers(){
        for (WeatherObserver observer : observers){
            observer.update(weatherUpdate);
        }
    }
}
