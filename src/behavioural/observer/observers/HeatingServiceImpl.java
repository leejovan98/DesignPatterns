package behavioural.observer.observers;

public class HeatingServiceImpl implements TemperatureStationObserver {
    @Override
    public void update(float temperature) {
        if(temperature < 18.0){
            System.out.println("heater is on");
        } else {
            System.out.println("heater is off");
        }
    }
}
