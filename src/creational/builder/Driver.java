package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarBuilderImpl;
import creational.builder.builders.EngineBuilder;
import creational.builder.builders.EngineBuilderImpl;
import creational.builder.objects.Car;
import creational.builder.objects.Engine;

public class Driver {
    public static void main(String[] args) {
        EngineBuilder engineBuilder = new EngineBuilderImpl();
        engineBuilder.buildVolume(4);
        engineBuilder.buildCylinders(6);
        Engine engine = engineBuilder.getEngine();

        CarBuilder carBuilder = new CarBuilderImpl();
        carBuilder.buildEngine(engine);
        carBuilder.buildDoors(4);
        carBuilder.buildWheels(4);
        Car car = carBuilder.getCar();
    }
}
