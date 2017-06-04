package AbstractFactory;

import java.util.ArrayList;

/**
 * Created by snowWave on 2017/6/4
 */
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList();
    public Tray(String caption){
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
