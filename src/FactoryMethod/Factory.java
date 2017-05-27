package FactoryMethod;

/**
 * Created by snowWave.
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String string);
    protected abstract void  registerProduct(Product product);

}
