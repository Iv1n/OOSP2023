package Pattern10;

public class CarSystemFacade {
    private ECU engine;
    private ClimateControl climateControl;
    private Multimedia multimedia;

    public CarSystemFacade() {
        this.engine =new ECU();
        this.climateControl = new ClimateControl();
        this.multimedia = new Multimedia();
    }
    public void startCar(){
        engine.startEngine();
        climateControl.setTemperature(23);
        multimedia.playMusic("Glad Valakas");
        climateControl.OnAirConditioning();
    }

    public void stopCar(){
        engine.stopEngine();
        climateControl.OffAirConditioning();
        multimedia.stopMusic();
    }

}
