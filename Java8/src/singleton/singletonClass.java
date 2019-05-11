package singleton;

final public class singletonClass {

    singletonClass singletonClassInstance = null;

    private singletonClass() {
    }
    singletonClass getSingletonClassInstance() {
        if (singletonClassInstance == null) {
            singletonClassInstance = new singletonClass();
            return singletonClassInstance;
        } else {
            return singletonClassInstance;
        }
    }
}
