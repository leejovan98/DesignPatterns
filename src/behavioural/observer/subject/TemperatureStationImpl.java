package behavioural.observer.subject;

import behavioural.observer.observers.TemperatureStationObserver;

import java.util.HashSet;
import java.util.Set;

public class TemperatureStationImpl implements TemperatureStation {

    private Set<TemperatureStationObserver> observers;

    private float temperature;

    public TemperatureStationImpl(){
        this.observers = new HashSet<>();
        this.temperature = 0.0f;
    }

    @Override
    public void register(TemperatureStationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(TemperatureStationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(TemperatureStationObserver o: observers){
            o.update(this.temperature);
        }
    }

    /*
    * Triggers the call to notify when temperature value is changed
    * */
    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
