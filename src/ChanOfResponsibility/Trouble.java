package ChanOfResponsibility;

/**
 * Created by snowWave on 2017/5/31
 */
public class Trouble {
    private int number;             //生成编号
    public Trouble(int number){        //生成问题
        this.number = number;
    }
    public int getNumber(){         //获取问题编号
        return number;
    }
    public String toString(){       //代表问题的字符串
        return "[Trouble   " + number + "]";
    }
}
