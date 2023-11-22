package structural.adapter;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // initialise dependencies
        Scanner sc = new Scanner(System.in);
        TemperatureServiceAdapter adapter = new TemperatureServiceAdapterImpl();

        // "client" code is already configured to accept celsius temperature values
        System.out.print("Input current temperature (C): ");
        Float celsiusTemperature = sc.nextFloat();

        // save to "TemperatureService" that only accepts fahrenheit temperatures via the adapter
        adapter.saveTemperature(celsiusTemperature);

    }

}
