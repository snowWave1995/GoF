package Interpreter;


/**
 * Created by snowWave on 2017/6/4
 */

//<primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {
    private String name;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if ( !name.equals("go") && !name.equals("right") && !name.equals("left")){
            throw new ParseException(name + "is nudifined");
        }
    }
    public String toString(){
        return name;
    }
}
