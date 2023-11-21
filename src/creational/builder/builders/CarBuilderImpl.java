package creational.builder.builders;

import creational.builder.objects.Car;
import creational.builder.objects.Engine;

public class CarBuilderImpl implements CarBuilder {

    private final Car car;

    public CarBuilderImpl(){
        this.car = new Car();
    }

    @Override
    public void buildEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void buildWheels(int wheels) {
        this.car.setWheels(wheels);
    }

    @Override
    public void buildDoors(int doors) {
        this.car.setDoors(doors);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
