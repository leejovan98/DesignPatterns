package structural.adapter;

import structural.adapter.external.TemperatureService;
import structural.adapter.external.TemperatureServiceImpl;

public class TemperatureServiceAdapterImpl implements TemperatureServiceAdapter {

    private final TemperatureService temperatureService;

    public TemperatureServiceAdapterImpl(){
        this.temperatureService = new TemperatureServiceImpl();
    }

    public void saveTemperature(Float celsiusTemperature){
        Float fahrenheitTemperature = (celsiusTemperature * 9 / 5)  + 32;
        this.temperatureService.saveTemperature(fahrenheitTemperature);
    }

}
