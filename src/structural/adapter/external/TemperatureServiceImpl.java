package structural.adapter.external;

public class TemperatureServiceImpl implements TemperatureService {

    @Override
    public void saveTemperature(Float fahrenheitTemperature) {
        System.out.printf("saving temperature = %.2fF%n", fahrenheitTemperature);
    }
}
