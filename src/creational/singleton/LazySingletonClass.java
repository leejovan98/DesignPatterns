package creational.singleton;

/*
* Lazy Singleton Class
*   - only instantiates object when get method is invoked
*   - delays memory assignment
*
* */
public class LazySingletonClass {

    private static LazySingletonClass INSTANCE;

    private LazySingletonClass(){}

    public static LazySingletonClass getLazySingletonClass(){
        if(INSTANCE == null){
            INSTANCE = new LazySingletonClass();
        }
        return INSTANCE;
    }

}
