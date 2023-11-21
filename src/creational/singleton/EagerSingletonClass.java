package creational.singleton;

/*
 * Eager Singleton Class
 *   - instantiates instance when class is loaded into memory
 *   - memory is "eagerly" assigned
 *   - should be avoided if creation is expensive
 *
 * */
public class EagerSingletonClass {

    private static final EagerSingletonClass INSTANCE;

    private EagerSingletonClass(){}

    static {
        INSTANCE = new EagerSingletonClass();
    }

    public static EagerSingletonClass getEagerSingletonClass(){
        return INSTANCE;
    }

}
