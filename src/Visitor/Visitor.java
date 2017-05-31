package Visitor;

/**
 * Created by snowWave on 2017/5/31
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
