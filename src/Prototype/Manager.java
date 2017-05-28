package Prototype;

import java.util.HashMap;

/**
 * Created by snowWave.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name , Product proto){
        showcase.put(name , proto);
    }
    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
