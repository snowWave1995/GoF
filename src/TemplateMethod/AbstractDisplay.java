package TemplateMethod;

/**
 * Created by snowWave.
 */
public abstract class AbstractDisplay {
    public abstract void open();        //交给子类实现
    public abstract void print();       //交给子类实现
    public abstract void close();       //交给子类实现
    public final void display(){        //本抽象类实现
        open();
        for(int i = 0; i < 5; i++){
            print();
        }
        close();
    }
}
