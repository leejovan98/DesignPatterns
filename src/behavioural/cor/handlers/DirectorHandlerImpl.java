package behavioural.cor.handlers;

public class DirectorHandlerImpl implements Handler {

    private Handler nextHandler;

    @Override
    public void handleRequest(float amount) {
        System.out.println("handled by director");
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
