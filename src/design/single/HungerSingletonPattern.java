package design.single;

import java.io.Serializable;

public class HungerSingletonPattern implements Serializable {
    private static final HungerSingletonPattern instance = new HungerSingletonPattern();

    private HungerSingletonPattern() {

    }

    public static HungerSingletonPattern getInstance() {
        return instance;
    }

    private Object readResolve(){
        return instance;
    }

}
