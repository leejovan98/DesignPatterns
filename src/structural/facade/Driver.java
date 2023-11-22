package structural.facade;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        // initialise dependencies
        Scanner sc = new Scanner(System.in);
        PaymentsFacade facade = new PaymentsFacadeImpl();

        // receive user input
        System.out.println("Payment maker (AML checks enabled for amounts >$10,000)");
        System.out.print("Input payment amount: $");
        Float amount = sc.nextFloat();

        // perform (mandatory) checks + payment via facade
        facade.makePayment(amount);

    }
}
