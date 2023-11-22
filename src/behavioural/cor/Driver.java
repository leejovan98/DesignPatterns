package behavioural.cor;

import behavioural.cor.handlers.DirectorHandlerImpl;
import behavioural.cor.handlers.Handler;
import behavioural.cor.handlers.ManagerHandlerImpl;
import behavioural.cor.handlers.StaffHandlerImpl;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        // initialise chain
        Handler paymentHandler = new StaffHandlerImpl();
        paymentHandler.setNextHandler(new ManagerHandlerImpl());
        paymentHandler.getNextHandler().setNextHandler(new DirectorHandlerImpl());

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter processing amount: $");
        float amount = sc.nextFloat();

        // run processing amount through chain
        paymentHandler.handleRequest(amount);

    }
}
