package structural.facade.subsystem;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void makePayment(float amount) {
        System.out.printf("making payment of $%.2f%n", amount);
    }
}
