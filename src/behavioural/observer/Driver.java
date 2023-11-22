package behavioural.observer;

import behavioural.observer.observers.AirConditioningServiceImpl;
import behavioural.observer.observers.FanServiceImpl;
import behavioural.observer.observers.HeatingServiceImpl;
import behavioural.observer.observers.TemperatureStationObserver;
import behavioural.observer.subject.TemperatureStation;
import behavioural.observer.subject.TemperatureStationImpl;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        // declaring subject
        TemperatureStation temperatureStation = new TemperatureStationImpl();

        // declare observers
        TemperatureStationObserver fanService = new FanServiceImpl();
        TemperatureStationObserver heatingService = new HeatingServiceImpl();
        TemperatureStationObserver airConditioningService = new AirConditioningServiceImpl();

        // register observers
        temperatureStation.register(fanService);
        temperatureStation.register(heatingService);
        temperatureStation.register(airConditioningService);

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Input current temperature (C): ");
        float celsiusTemperature = sc.nextFloat();

        // set temperature of temperature station
        // (will in turn trigger notifications to the observers!)
        temperatureStation.setTemperature(celsiusTemperature);
    }
}
