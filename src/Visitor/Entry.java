package Visitor;


import Composite.FileTreatMentException;

/**
 * Created by snowWave on 2017/5/31
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatMentException{
        throw new FileTreatMentException();
    }
    public Iterable iterable() throws FileTreatMentException{
        throw new FileTreatMentException();
    }
    public String toString(){
        return getName() + "(" + getSize() + ")";
    }
}
