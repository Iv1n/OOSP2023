package Pattern5;

public class WeatherSubscriber implements WeatherObserver{
    private String name;

    public WeatherSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String weatherUpdate) {
        System.out.println(name + " received weather update: " + weatherUpdate);
    }

}
