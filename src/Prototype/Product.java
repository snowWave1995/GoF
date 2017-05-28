package Prototype;


/**
 * Created by snowWave.
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
