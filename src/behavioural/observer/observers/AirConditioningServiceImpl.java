package behavioural.observer.observers;

public class AirConditioningServiceImpl implements TemperatureStationObserver {
    @Override
    public void update(float temperature) {
        if(temperature > 26){
            System.out.println("air conditioning is on");
        } else {
            System.out.println("air conditioning is off");
        }
    }
}
