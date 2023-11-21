package creational.builder.objects;

/*
* Car Class
*   - complex class containing another class (Engine)
*
* */
public class Car {

    private Engine engine;
    private int wheels;
    private int doors;

    public Car() {}

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
