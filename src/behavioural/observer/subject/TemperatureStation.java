package behavioural.observer.subject;

import behavioural.observer.observers.TemperatureStationObserver;

/*
* Our "Subject" that other objects can register with
* to receive updates when the temperature changes
* */
public interface TemperatureStation {

    void register(TemperatureStationObserver observer);
    void unregister(TemperatureStationObserver observer);
    void notifyObservers();

    void setTemperature(float celsiusTemperature);

}
