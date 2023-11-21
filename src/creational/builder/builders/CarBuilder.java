package creational.builder.builders;

import creational.builder.objects.Car;
import creational.builder.objects.Engine;

public interface CarBuilder {

    void buildEngine(Engine engine);
    void buildWheels(int wheels);
    void buildDoors(int doors);
    Car getCar();

}
