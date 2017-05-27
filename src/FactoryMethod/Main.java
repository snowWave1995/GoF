package FactoryMethod;

/**
 * Created by snowWave.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Person1");
        Product card2 = factory.create("Person2");
        Product card3 = factory.create("Person3");
        card1.use();
        card2.use();
        card3.use();
    }
}
