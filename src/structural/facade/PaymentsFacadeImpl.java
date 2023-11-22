package structural.facade;

import structural.facade.subsystem.AMLService;
import structural.facade.subsystem.AMLServiceImpl;
import structural.facade.subsystem.FraudCheckService;
import structural.facade.subsystem.FraudCheckServiceImpl;
import structural.facade.subsystem.PaymentService;
import structural.facade.subsystem.PaymentServiceImpl;

public class PaymentsFacadeImpl implements PaymentsFacade {

    private final AMLService amlService;
    private final FraudCheckService fraudCheckService;
    private final PaymentService paymentService;

    public PaymentsFacadeImpl(){
        this.amlService = new AMLServiceImpl();
        this.fraudCheckService = new FraudCheckServiceImpl();
        this.paymentService = new PaymentServiceImpl();
    }

    /*
    * Simple facade method that provides a single points of entry to initiate payments
    * but invokes different (conditional) checks within the payment subsystem
    * before making the payment
    * */
    @Override
    public void makePayment(Float amount) {
        if(amount > 10000.00){
            this.amlService.doAMLCheck();
        }
        this.fraudCheckService.doFraudCheck();
        this.paymentService.makePayment(amount);
    }
}
