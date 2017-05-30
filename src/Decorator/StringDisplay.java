package Decorator;

/**
 * Created by snowWave on 2017/5/30
 */
public class StringDisplay extends Display{
    private String string;
    public StringDisplay(String string){
        this.string = string;
    }
    public int getColumns(){
        return string.getBytes().length;
    }
    public int getRows(){
        return 1;
    }
    public String getRowText(int row){
        if (row == 0){
            return string;
        }else {
            return null;
        }
    }
}
