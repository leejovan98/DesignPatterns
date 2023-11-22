package behavioural.cor.handlers;

public class StaffHandlerImpl implements Handler {

    public Handler nextHandler;

    @Override
    public void handleRequest(float amount) {
        if(amount < 1000){
            System.out.println("handled by staff");
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
