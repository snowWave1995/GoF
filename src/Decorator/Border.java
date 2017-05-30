package Decorator;

/**
 * Created by snowWave on 2017/5/30
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
