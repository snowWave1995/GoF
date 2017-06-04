package Interpreter;

/**
 * Created by snowWave on 2017/6/4
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
