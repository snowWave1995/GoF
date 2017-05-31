package Visitor;

/**
 * Created by snowWave on 2017/5/31
 */
public interface Element {
    public abstract void accept(Visitor v);
}
