package creational.builder.builders;

import creational.builder.objects.Engine;

public class EngineBuilderImpl implements EngineBuilder {

    private final Engine engine;

    public EngineBuilderImpl(){
        this.engine = new Engine();
    }

    @Override
    public void buildCylinders(int cylinders) {
        this.engine.setCylinders(cylinders);
    }

    @Override
    public void buildVolume(int volume) {
        this.engine.setVolume(volume);
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }
}
