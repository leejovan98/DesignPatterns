package creational.builder.builders;

import creational.builder.objects.Engine;

public interface EngineBuilder {

    void buildCylinders(int cylinders);
    void buildVolume(int volume);
    Engine getEngine();

}
