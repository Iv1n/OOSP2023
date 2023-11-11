package Pattern5;

public class Main5 {
    public static void main(String[] args){
        WeatherStation weatherStation = new WeatherStation();

        WeatherObserver subscribe1 = new WeatherSubscriber("Dmitriy");
        WeatherObserver subscribe2 = new WeatherSubscriber("Oleg");


        weatherStation.addObserver(subscribe1);
        weatherStation.addObserver(subscribe2);

        weatherStation.setWeatherUpdate("Sunny 11.11.2023");
        weatherStation.setWeatherUpdate("Rain 12.11.2023");

    }
}


