package behavioural.cor.handlers;

/*
* Simple handler that passes requested amount down the chain
* until a role is able to handle the amount
*
* */
public interface Handler {

    void handleRequest(float amount);
    void setNextHandler(Handler handler);
    Handler getNextHandler();

}
