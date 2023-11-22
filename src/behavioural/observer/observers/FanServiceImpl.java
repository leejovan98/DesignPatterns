package behavioural.observer.observers;

public class FanServiceImpl implements TemperatureStationObserver {
    @Override
    public void update(float temperature) {
        if(temperature > 20){
            System.out.println("fan is on");
        } else {
            System.out.println("fan is off");
        }
    }
}
