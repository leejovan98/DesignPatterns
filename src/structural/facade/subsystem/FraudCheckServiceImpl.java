package structural.facade.subsystem;

public class FraudCheckServiceImpl implements FraudCheckService {
    @Override
    public void doFraudCheck() {
        System.out.println("performing fraud check...");
    }
}
