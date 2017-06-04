package AbstractFactory;

/**
 * Created by snowWave on 2017/6/4
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String makeHTML();
}
