package behavioural.cor.handlers;

public class ManagerHandlerImpl implements Handler {

    private Handler nextHandler;

    @Override
    public void handleRequest(float amount) {
        if(amount < 1000000){
            System.out.println("handled by manager");
        } else {
            nextHandler.handleRequest(amount);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public Handler getNextHandler() {
        return this.nextHandler;
    }
}
